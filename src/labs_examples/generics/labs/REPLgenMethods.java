package labs_examples.generics.labs;

public class REPLgenMethods {
    public static void main(String[] args) {
        // Step 1) create an array of 5 strings then call the printArray() method and pass the String array

        String arr[] = new String[]{"One", "Two", "Three", "Four", "Five"};
        printArray(arr);

        // Step 1) create an array of 5 ints then call the printArray() method and pass the int array

        Integer nums[] = new Integer[]{1,2,3,4,5};
        printArray(nums);

        // Step 1) create an array of 5 doubles then call the printArray() method and pass the double array

        Double doub[] = new Double[]{1.0,2.0,3.0,4.0,5.0};
        printArray(doub);

    }

    public static < E > void printArray( E[] inputArray ) {
        // Display array elements
        for(E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

}
