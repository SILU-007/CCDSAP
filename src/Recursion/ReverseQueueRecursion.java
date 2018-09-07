package Recursion;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueueRecursion {

    static Queue<Integer> reverseQueue(Queue<Integer> queue){
        if(queue.isEmpty()){
            return queue;
        }
        int data=queue.peek();
        queue.remove();

        queue=reverseQueue(queue);

        queue.add(data);
        return queue;
    }

    static void printQueue(Queue<Integer> queue){
        if(queue.isEmpty()){
            System.out.println("Queue is Empty");
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
        }

    }
    public static void main(String[] args) {
       Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(56);
        queue.add(27);
        queue.add(30);
        queue.add(45);
        queue.add(85);
        queue.add(92);
        queue.add(58);
        queue.add(80);
        queue.add(90);
        queue.add(100);
        queue = reverseQueue(queue);
        printQueue(queue);

    }
}
