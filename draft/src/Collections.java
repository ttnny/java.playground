import java.lang.reflect.Array;
import java.util.*;

public class Collections {
    public static void main(String[] args) {
        // ArrayList & LinkedList classes implements List interface
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Stack class also implements List interface but
        // List<Integer> stack = new Stack<>() doesn't have
        // push(), pop(), and peek() methods
        Stack<Integer> stack = new Stack<>();

        // LinkedList class implements Queue interface
        Queue<Integer> queueL = new LinkedList<>();

        // PriorityQueue class implements Queue interface
        Queue<Integer> queueP = new PriorityQueue<>();

        // Set

        // Map


        // ArrayList operations
        arrayList.add(3);
        arrayList.remove(3);
        arrayList.size();
        arrayList.contains(5);
        arrayList.isEmpty();
        arrayList.get(0);
        arrayList.set(0, 8);
        arrayList.clear();

        // ArrayList operations
        linkedList.add(3);
        linkedList.remove(3);
        linkedList.size();
        linkedList.contains(5);
        linkedList.isEmpty();
        linkedList.get(0);
        linkedList.set(0, 8);
        linkedList.clear();

        // Stack operations (LIFO)
        stack.push(3);
        stack.pop();
        stack.peek();
        stack.empty();
        stack.search(5);
        stack.remove(3);
        stack.clear();
        stack.size();

        // Queue operations (FIFO)
        queueL.add(3);
        queueL.poll();      // Return null when queue is empty
        queueL.remove();    // Similar to poll(). NoSuchElementException when queue is empty
        queueL.peek();
        queueL.element();   // Similar to peek(). NoSuchElementException when queue is empty
        queueL.offer(5); // Similar to add() but return false if exceptions thrown
    }
}