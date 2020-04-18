package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        // Calling the method multiply()
        int x = multiply(7, 8);
        System.out.println("x = " + x);

        // Calling the method divide()
        //int y = divide(7, 8);
        System.out.println("y = " + divide(12, 8));

        // Calling the method joke()
        joke();

        // Calling the method numOfSeconds()
        System.out.println("The number of seconds in a  3 years is " + numOfSeconds(3));

        // Calling the method varargs()
        String[] arr = new String[10];
        System.out.println("The length of the array is : " + varargs(arr));

    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    static int multiply(int a, int b){
        return a * b;
    }



    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    static double divide(int a, int b){
        return a / b;
    }


    // 3) Create a static void method that will print of joke of your choice to the console

    static void joke(){
        System.out.println("What do you call a computer that sings?");
        System.out.println("A-dell");
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents

    static int numOfSeconds(int years){
        // assuming a year is 365 days
        int secondInADay = 86400;
        int numOfDaysInAYear = 365;
        return years * secondInADay *numOfDaysInAYear;
    }


    // 5) Create a varargs method that will return the length of the varargs array passed in
    static int varargs(String... arr){
        return arr.length;
    }






}
