package queues;

import java.util.*;

public class Queue_ {
    public static void main(String[] args) {
        // Declare
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new PriorityQueue<>();

        // Use
        queue1.add(5);
        queue1.add(5);
        queue1.add(9);
        queue1.remove(5);
        queue1.peek();
        queue1.element();
        queue1.poll();
        queue2.size();

        // Iterate
        for (int item : queue1) {
            System.out.println(item);
        }
    }
}