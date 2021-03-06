package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("please enter a word  : ");
        // assign input to variable as int
        String str = scanner.next();
        String vowels ="aeiou";

        int count = 0;
        while(count < str.length()){
            char c = str.charAt(count);
            if(vowels.indexOf(c) != -1){
                System.out.println("The first vowel in " + str + " is " + c);
                break;
            }
            count++;
        }
    }
}
