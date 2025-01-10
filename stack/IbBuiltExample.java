package stack;

import java.util.*;

class InBuiltExample {
    public static void main(String[] args) {
        // Example: Using Stack from Java's built-in library
        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Pop elements
        System.out.println("Popped Element: " + stack.pop());

        // Peek at the top element
        System.out.println("Top Element: " + stack.peek());

        // Check if the stack is empty
        System.out.println("Is Stack Empty? " + stack.isEmpty());
    }
}
