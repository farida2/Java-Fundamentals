package labs_examples.arrays.labs;

import java.util.Random;

/**
 *  2D Array
 *
 *      Create and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        int[][] twoDArray = new int[5][5];
        // use 2 for loops to populate the 2d array
        // first for loop
        Random rand = new Random();

        int count = 3;
        for (int i = 0; i < twoDArray.length; i++){
            for (int j = 0; j < twoDArray[i].length; j++){
                //twoDArray[i][j] = count;
                twoDArray[i][j] = rand.nextInt(100);
               // count += 3;
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
