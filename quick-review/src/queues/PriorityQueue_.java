package queues;

import java.util.PriorityQueue;

public class PriorityQueue_ {
    public static void main(String[] args) {
        // Declare
        PriorityQueue<String> pQueue = new PriorityQueue<>();

        // Use
        pQueue.add("A");
        pQueue.add("A");
        pQueue.add("B");
        pQueue.remove("A");
        pQueue.peek();
        pQueue.poll();

        // Iterate
        for (String item : pQueue) {
            System.out.println(item);
        }
    }
}