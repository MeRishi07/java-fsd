package Assisted_Practice_Projects;

import java.util.*;

public class Practice_Project5 {
    public static void main(String[] args) {
        // List Example
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("List Example: " + list);

        // Set Example
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println("Set Example: " + set);

        // Map Example
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Alice", 30);
        map.put("Bob", 35);
        System.out.println("Map Example: " + map);

        // Queue Example
        Queue<String> queue = new LinkedList<>();
        queue.offer("Element 1");
        queue.offer("Element 2");
        queue.offer("Element 3");
        System.out.println("Queue Example: " + queue);

        // Stack Example
        Stack<String> stack = new Stack<>();
        stack.push("Element 1");
        stack.push("Element 2");
        stack.push("Element 3");
        System.out.println("Stack Example: " + stack);

        // Iterator Example
        Iterator<String> iterator = list.iterator();
        System.out.print("Iterator Example: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
