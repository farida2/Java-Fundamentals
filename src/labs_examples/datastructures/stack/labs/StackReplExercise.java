package labs_examples.datastructures.stack.labs;

import java.util.Stack;

public class StackReplExercise {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack();

        // push several elements onto the Stack
        myStack.push("My ");
        myStack.push("name ");
        myStack.push("is ");
        myStack.push(("Farida "));
        myStack.push("!");

        // print the first element in the Stack
        System.out.println("The first element of the stack is : " + myStack.firstElement());
        System.out.println("The top element of the stack is : " + myStack.peek());

        // pop the first element off the Stack
        myStack.pop();

        // print the first element in the Stack again
        System.out.println("The first element of the stack is : " + myStack.firstElement());
        System.out.println("The top element of the stack is : " + myStack.peek());


        // demonstrate at least 3 other Stack method
        System.out.println("The size of myStack is : " + myStack.size());
        System.out.println("The element at index 2 is  : " + myStack.get(2));
        System.out.println("The last element of the stack is : " + myStack.lastElement());

    }
}
