public class MyLinkedList implements NodeList{

    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem newItem) {


        if(root == null){
            root = newItem;

            return true;
        }

        ListItem currentItem = root;

        while(currentItem != null){

            int comparison = newItem.compareTo(currentItem);

            if(comparison > 0){

                if(currentItem.next() == null){
                    newItem.setPrevious(currentItem).setNext(newItem);

                    return true;
                }

                currentItem = currentItem.next();

            } else if(comparison == 0){
                return false;
            } else {

                if(currentItem.previous() == null){

                    root.setPrevious(newItem).setNext(root);
                    root = newItem;

                } else {

                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);

                }

                return true;

            }

        }

        return false;
    }

    @Override
    public boolean removeItem(ListItem newItem) {

        if(root == null){
            return false;
        }

        if(root.compareTo(newItem) == 0){
            root = null;

            return true;
        }

        ListItem currentItem = root;

        while(currentItem != null){

            int comparison = newItem.compareTo(currentItem);

            if(comparison == 0){

                if(currentItem.next() == null){

                    currentItem.previous().setNext(null);
                    newItem.setPrevious(null);

                } else {
                    currentItem.previous().setNext(currentItem.next());
                    currentItem.next().setPrevious(currentItem.previous());
                    newItem.setNext(null);
                    newItem.setPrevious(null);
                }

                return true;
            }

            currentItem = currentItem.next();

        }


        return false;
    }

    @Override
    public void traverse(ListItem root) {

        if(root == null){
            System.out.println("The list is empty");
        }

        ListItem currentItem = root;

        while(currentItem != null){

            System.out.println((String) currentItem.getValue());

            currentItem = currentItem.next();

        }

    }


















}
