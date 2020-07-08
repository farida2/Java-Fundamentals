package labs_examples.datastructures.linkedlist.labs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *      LinkedLists - Exercise_01
 *
 *      Demonstrate your mastery of Java's built-in LinkedList class by demonstrating the following:
 *
 *      1) create a LinkedList (from Java's libraries)
 *      2) add()
 *      3) addAll()
 *      4) addFirst()
 *      5) addLast()
 *      6) getFirst()
 *      7) getLast()
 *      8) get()
 *      9) set()
 *      10) push()
 *      11) pop()
 *      12) remove()
 *      13) contains()
 *      14) listIterator()
 *      15) clear()
 */
public class Exercise_01 {

    public static void main(String[] args) {
        // 1)
        LinkedList<String> aList = new LinkedList();

        // 2)
        aList.add("This");
        aList.add("is");
        aList.add("Fun");
        aList.add("!");

        // 3)
        // creating a collection to use addAll() method
        Collection<String> collect = new ArrayList<>();
        collect.add("keep");
        collect.add("up");
        collect.add("the");
        collect.add("good");
        collect.add("work");

        aList.addAll(collect);

        // 4) addFirst()

        aList.addFirst("Farida,");

        // 5) addLast()

        aList.addLast("!!");

        // 6) getFirst()
        String first = aList.getFirst();
        System.out.println("first = " + first);

        // 7) getLast()

        String last = aList.getFirst();
        System.out.println("last = " + last);

        //  8) get()
        aList.get(4);
        System.out.println("aList.get(4) = " + aList.get(4));

        // 9) set()
        aList.set(4, "and, ");

        // 10) push()

        aList.push("#");

        // 11) pop()
        aList.pop();
        System.out.println("aList.pop() = " + aList.pop());

        // 12) remove()

        aList.remove(6);
        System.out.println("aList.remove(6) = " + aList.remove(6));

        // 13) contains()

        aList.contains("laptop");
        System.out.println("aList.contains(\"laptop\") = " + aList.contains("laptop"));


        // 14) listIterator()
        // Setting the ListIterator at  position 2 (starting the iteration from index 2)

        ListIterator iterator = aList.listIterator(2);

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        // 15) clear()
        aList.clear();
        System.out.println(aList);




    }
}