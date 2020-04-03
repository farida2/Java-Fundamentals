package labs_examples.conditions_loops.labs;
import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // 1) create scanner (don't forget to import Scanner!)
        // 2) prompt user
        // 3) assign input to variable as int
        // 4) write completed code here

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a number between 1 and 7 : ");
        // assign input to variable as int
        int number = scanner.nextInt();

        if(number > 1){
           if(number > 2){
               if(number > 3){
                   if(number > 4){
                       if(number > 5){
                           if(number > 6){
                               System.out.println("Sunday");
                               return;
                           }
                           System.out.println("Saturday");
                           return;
                       }
                       System.out.println("Friday");
                       return;
                   }
                   System.out.println("Thursday");
                   return;
               }
               System.out.println("Wednesday");
               return;
           }
            System.out.println("Tuesday");
            return;

        } else {
            System.out.println("Monday");
        }
    }
}
