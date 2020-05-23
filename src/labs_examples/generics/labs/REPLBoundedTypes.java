package labs_examples.generics.labs;

public class REPLBoundedTypes {
    public static void main(String[] args) {

        // Step 1) create the generic method as instructed in the NumericExample class

        // Step 2) call that method and pass two doubles
        NumericExample db = new NumericExample();
        int x = db.sum(1.5,2.75);
        System.out.println("The sum of doubles is = " + x);

        // Step 3) call that method and pass two ints
        int y = db.sum(1,4);
        System.out.println("The sum of ints is = " + y);

        // Step 4) call that method and pass two floats
        int z = db.sum(3.5f,10.75f);
        System.out.println("The sum of floats is = " + z);

        // Step 5) call that method and pass one int and one double
        int u = db.sum(7,13.25);
        System.out.println("The sum of an int and a double is = " + u);


    }
}

class NumericExample {

    // write a generic method below that will return the sum of ANY two numeric values (no matter what their specific data type is)
    // (but remember the values must be Numeric)
    public <T extends Number, V extends Number> int sum(T t, V v){
        return t.intValue() + v.intValue();

    }

}

