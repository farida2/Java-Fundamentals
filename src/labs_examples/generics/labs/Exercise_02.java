package labs_examples.generics.labs;

import java.util.ArrayList;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList
 */

class ClassWithGenericMethod {
    public  int genSum(ArrayList<? extends Number> arr){

        int sum = 0;

        for(int i = 0; i < arr.size(); i++){
            sum += arr.indexOf(i);
        }
        return sum;
    }
}
class GenSumDemo{
    public static void main(String[] args) {
        ArrayList<Number> arr = new ArrayList<>();

    }
}
