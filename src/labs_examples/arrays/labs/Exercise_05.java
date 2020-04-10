package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int count = 0;

        // populate arr = [0,2,4,6,8]
        System.out.print("arr[i] = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = count;
            System.out.print(arr[i] + " ");
            count += 2;
        }

        System.out.println();

        // print out every other element in arr in reverse
        // arr in reverse = [8,6,4,2,0]
        // every other element is [ 8, 4, 0]
         System.out.print("Print out every other element in arr in reverse :");
        for (int i = arr.length - 1 ; i >= 0 ; i--) {
            if ( i % 2 == 0){
                System.out.print(arr[i] + " ");
            }

        }
    }

}
