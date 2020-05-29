package labs_examples.generics.labs;

       /*   1) Write a generic method that accepts two generic arguments. This generic method should only accept
        *      arguments which are subclasses of Number. The generic method must return the sum (as a double) of whatever two
        *      numbers were passed in regardless of their type
        *
        */

public class Exercise_03_01 {
    public static <T extends Number> T theSum(T a, T b){
        if (a instanceof Double) {
            return (T) new Double(a.doubleValue() + b.doubleValue());
        } else if (a instanceof Integer) {
            return (T)new Integer(a.intValue() + b.intValue());
        } else if (a instanceof Float) {
            return (T)new Float(a.floatValue() + b.floatValue());
        } else {
            throw new IllegalArgumentException("The type of " + a.getClass() + " is not supported here");
        }

    }

    public static void main(String[] args) {
        System.out.print("The sum of two integers is : ");
        int x = theSum(5,78);
        System.out.println(x);

        System.out.print("The sum of two doubles is : ");
        double y = theSum(0.57, 15.45);
        System.out.println( y);

        System.out.print("The sum of two floats is : ");
        float z =  theSum(12f, 31f);
        System.out.println(z);

//        System.out.print("The sum of two longs is : ");
//        long w =  theSum(12l, 31l);
//        System.out.println(z);



    }
}
