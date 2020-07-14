package labs_examples.datastructures.queue.labs;

import java.util.PriorityQueue;

public class QueueReplExercise {
    public static void main(String[] args) {
        PriorityQueue<String> myQueue = new PriorityQueue();

        // add several elements to the myQueue
        myQueue.add("elem1");
        myQueue.add("elem2");
        myQueue.add("elem3");
        myQueue.add("elem4");
        myQueue.add("elem5");
        myQueue.add("elem6");


        // print out every element in this myQueue
        for(String s : myQueue){
            System.out.println(s);
        }


        // why did they print out in the order they did
        // Because of the first in first out rule in the queue?

        // pop the first element off the myQueue
        String elem = myQueue.remove();
        System.out.println("Popping the fist element in myQueue " + elem);

        // print out every element again
        for(String s : myQueue){
            System.out.println(s);
        }

        // demonstrate several other PriorityQueue methods
        // the method contains()
        boolean hasElem = myQueue.contains("elem0");
        System.out.println("Contains \"elem0\" ? -> " + hasElem);

        // the method peek()
        System.out.println("the front element in myQueue is : " + myQueue.peek());

        // the method clear()
        myQueue.clear();

        // the method size()
        int x = myQueue.size();
        System.out.println("the size of myQueue now is = " + x);




    }

}

