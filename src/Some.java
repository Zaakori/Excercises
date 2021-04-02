import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Some {



    public static void main(String[] args) {

        Node node1 = new Node("Tim");
        Node node2 = new Node("Adelka");

        MyLinkedList myList = new MyLinkedList(node1);

        myList.addItem(new Node("Timurochka"));
        myList.addItem(node2);
        myList.addItem(new Node("Maratoid"));
        myList.addItem(new Node("Kolbaskin"));


        myList.traverse(node1);
        System.out.println();
        myList.traverse(node2);




    }


}