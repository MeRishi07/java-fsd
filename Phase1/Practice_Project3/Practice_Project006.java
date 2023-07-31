package Assisted_Practice_Projects3;

public class Practice_Project006 {
    private Node head;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head; // Make it circular
        } else if (data <= head.data) {
            Node last = getLastNode();
            last.next = newNode;
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != head && data > current.next.data) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    private Node getLastNode() {
        Node last = head;
        while (last.next != head) {
            last = last.next;
        }
        return last;
    }

    public void display() {
        if (head == null) {
            System.out.println("Circular linked list is empty.");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    public static void main(String[] args) {
        Practice_Project006 list = new Practice_Project006();

        list.insert(2);
        list.insert(4);
        list.insert(6);
        list.insert(8);
        list.insert(10);

        System.out.println("Circular Linked List:");
        list.display();
    }
}
