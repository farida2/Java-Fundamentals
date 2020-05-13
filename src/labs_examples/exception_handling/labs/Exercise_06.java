package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

//
//  public class UnderAgeException extends Exception {
//
//    @Override
//    public String toString() {
//        return "UnderAgeException{ Must be 18 to vote }";
//    }
// }
//
//  public class Example {
//    public static void main(String[] args){
//        try {
//            vote();
//        } catch (UnderAgeException e) {
//            System.out.println("Unfortunately you must be 18 to vote");
//        }
//    }
//
//    public static void vote() throws UnderAgeException {
//      Scanner input = new Scanner(System.in);
//      System.out.println("Are you younger than 18 years old ? (y/n)");
//      String response = input.next();
//        if (response.equalsIgnoreCase("n")) {
//            // manually throw new custom exception
//            throw new UnderAgeException();
//        }
//        System.out.println("You can vote");
//
//    }
//}
