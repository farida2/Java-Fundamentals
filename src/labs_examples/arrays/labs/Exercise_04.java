package labs_examples.arrays.labs;

import java.util.Random;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        int[][] twoDArray = new int[4][3];
        int count = 0;
        //populate twoDArray
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                twoDArray[i][j] = count;
                count++;

            }
        }
        //print out its elements using for-each
        for(int[] arr : twoDArray){
            for(int num : arr){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
