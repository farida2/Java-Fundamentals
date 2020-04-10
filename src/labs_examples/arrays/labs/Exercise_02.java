package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
        // create scanner
        Scanner input = new Scanner(System.in);
        //prompt user
        System.out.println("Enter a number from 1-10 : ");
        // assign the input to a variable as int
        int number = input.nextInt();

        for(int i = 0; i < array.length; i++){
            if(array[i] == number){
                System.out.println("The index of the number you entered " + number +" is: " + i );
            }
        }




    }
}