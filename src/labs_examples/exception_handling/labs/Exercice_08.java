package labs_examples.exception_handling.labs;
/*
    1) Run this program as is. Do you see the exception thrown? Does "Program Complete" print?
    Yes there is an exception thrown : ArrayIndexOutOfBoundsException
    The statement "Program Complete" did not print

    2) Uncomment the try/catch block (the 4 lines that start with "//") then run the application again. See the difference? Did "Program complete" print?
    Now it is printing : "Error detected. Sorry bout that!"
    and "Program complete"

    3) Try to generate a new exception and catch it properly.
    I tried this :
     int[] nums = {67, 43,0};

        try {
        System.out.println(nums[0]/nums[2]);
         } catch (ArrayIndexOutOfBoundsException exc){
           System.out.println("Error detected. Sorry bout that!");
       }

       I got : ArithmeticException: / by zero
*/

public class Exercice_08 {
    public static void main(String[] args) {

        int[] nums = {67, 43,0};

        try {
        System.out.println(nums[0]/nums[2]);
         } catch (ArrayIndexOutOfBoundsException exc){
           System.out.println("Error detected. Sorry bout that!");
       }

        System.out.println("Program complete");
    }
}
