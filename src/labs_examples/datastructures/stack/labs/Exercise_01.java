package labs_examples.datastructures.stack.labs;

import java.util.Stack;

/**
 *      Demonstrate your mastery of Java's built-in Stack class by completing the following:
 *
 *      1) instantiate a new Stack
 *      2) demonstrate the use of EVERY method in the Stack class - there are 5
 */
public class Exercise_01{
    public static void main(String[] args) {
        Stack<Integer> newStack = new Stack();

        // Adding elements to newStack
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);
        newStack.push(5);
        newStack.push(6);

        // Checking its size
        System.out.println(" The size of newStack is : " + newStack.size());

        // removing the last element
        int x = newStack.pop();
        System.out.println("poping the last element = " + x);

        // checking the last element
        System.out.println("now the last element in newStack in : " + newStack.peek());

        // checking that the stack in not empty
        System.out.println("newStack is empty : " + newStack.empty());





    }
}