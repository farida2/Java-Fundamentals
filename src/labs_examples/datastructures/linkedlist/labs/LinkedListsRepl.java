package labs_examples.datastructures.linkedlist.labs;

import java.util.LinkedList;

public class LinkedListsRepl {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList();

        // demonstrate adding several elements to the LinkedList
        myList.add("One");
        myList.add("Two");
        myList.add("Three");
        myList.add("Four");
        myList.add("Five");

        // demonstrate retrieving one or more element from the LinkedList
        myList.get(1);
        System.out.println("myList.get(1) = " + myList.get(1));
        myList.get(3);
        System.out.println("myList.get(3) = " + myList.get(3));


        // demonstrate removing several elements from the LinkedList
        myList.remove(0);
        myList.get(0);
        System.out.println("myList.get(0) = " + myList.get(0));

        // demonstrate at least 4 additional method calls against the LinkedList
        myList.size();
        System.out.println("myList.size() = " + myList.size());

        myList.contains("Six");
        System.out.println("myList.contains(\"Six\") = " + myList.contains("Six"));
        
        
        System.out.println("myList.pop() = " + myList.pop());
        
        myList.push("six");
        System.out.println("myList.getFirst() = " + myList.getFirst());
        

    }

}
