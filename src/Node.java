public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    ListItem next(){

    return this.rightLink;

    }

    ListItem setNext(ListItem rightLink){

    this.rightLink = rightLink;

    return this.rightLink;

    }

    ListItem previous(){

    return this.leftLink;

    }

    ListItem setPrevious(ListItem leftLink){

        this.leftLink = leftLink;

        return this.leftLink;

    }

    int compareTo(ListItem compareToItem){

        if(compareToItem != null){

            return ((String) super.getValue()).compareTo((String) compareToItem.getValue());

        } else {
            return -1;
        }
    }







}
