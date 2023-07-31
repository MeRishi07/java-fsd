package Assisted_Practice_Projects3;

import java.util.LinkedList;
import java.util.Queue;

public class Practice_Project009 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Inserting elements into the queue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        System.out.println("Queue elements after insertion: " + queue);

        // Removing elements from the queue
        int element1 = queue.poll();
        int element2 = queue.poll();

        System.out.println("Removed elements: " + element1 + ", " + element2);
        System.out.println("Queue elements after removal: " + queue);
    }
}
