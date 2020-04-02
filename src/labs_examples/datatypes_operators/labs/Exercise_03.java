package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all arithmetic operators below. These include:
 *
 * addition, subtraction, multiplication, division and modulus
 *
 */
class ArithmeticOperators {

    public static void main(String[] args) {

        // write your code below

        int x = 35;
        int y = 22;
        int addition = x + y;
        int subtraction = x - y;
        int multiplication = x * y;
        int division = x / y;
        int remainder = x % y;
        System.out.println( x + " + " + y + " = " + addition);
        System.out.println( x + " - " + y + " = " + subtraction);
        System.out.println( x + " * " + y + " = " + multiplication);
        System.out.println( x + " / " + y + " = " + division);
        System.out.println( x + " % " + y + " = " + remainder);
    }

}
