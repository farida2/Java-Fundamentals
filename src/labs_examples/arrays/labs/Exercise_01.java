package labs_examples.arrays.labs;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        int sum = 0;
        double average = 0;
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = count;
            sum += count;
            count++;
        }
        average = (double)sum/arr.length;

        System.out.println("The sum is: " + sum + ", The average = " + average);


    }

}