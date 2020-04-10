package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {
        // Create ArrayList
        ArrayList<Integer> aList = new ArrayList<>();
        int count = 1;
        
        // Populate aList 
        for (int i = 0; i < 6 ; i++) {
            aList.add(i, count);
            count++;
        }
        // print out the aList elements
        for (int num: aList) {
            System.out.print(num + " ");
            
        }

        System.out.println();

        //get the aList size
        System.out.println("Size = " + aList.size());

        //get an element at a certain index
        System.out.println("Element at index 3 is  " + aList.get(3));

        // Remove an element
        aList.remove(4);
        System.out.print("The aList after removing the element at the index 4 is :");
        for (int num: aList) {
            System.out.print(num + " ");

        }

        System.out.println();

        //Check if the list contains number 4
        boolean check = aList.contains(4);
        System.out.println("Check if the list contains number 4 " + check);

        
        
        
    }
}
