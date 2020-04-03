package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 8: do-while loop
 *
 *      Use a "do-while" loop print out every third number counting backwards from 1000 to 1.
 *
 */

public class Exercise_08 {
    public static void main(String[] args) {
        int number = 0;
        int sum = 0;
        do{
            sum += number;
            number++;
        } while(number <= 100);

        System.out.println("sum = " + sum);
    }
}
