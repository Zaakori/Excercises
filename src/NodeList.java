public interface NodeList {

    ListItem getRoot();

    boolean addItem(ListItem givenListItem);

    boolean removeItem(ListItem givenListItem);

    void traverse(ListItem root);

}
