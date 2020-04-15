package lists;

import java.util.Stack;

public class Stack_ {
    public static void main(String[] args) {
        // Declare
        Stack<Integer> stack = new Stack<>();

        // Use
        stack.push(5);
        stack.push(5);
        stack.pop();
        stack.peek();
        stack.empty();
        System.out.println(stack.search(5));

        // Iterate
        for (int item : stack) {
            System.out.println(item);
        }
    }
}