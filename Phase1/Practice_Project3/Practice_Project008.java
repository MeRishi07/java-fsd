package Assisted_Practice_Projects3;

import java.util.Stack;

public class Practice_Project008 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Inserting elements into the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Stack elements after insertion: " + stack);

        // Removing elements from the stack
        int element1 = stack.pop();
        int element2 = stack.pop();

        System.out.println("Popped elements: " + element1 + ", " + element2);
        System.out.println("Stack elements after removal: " + stack);
    }
}

