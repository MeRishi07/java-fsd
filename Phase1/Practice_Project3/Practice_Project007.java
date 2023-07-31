package Assisted_Practice_Projects3;

public class Practice_Project007 {
    private Node head;

    private static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public void traverseForward() {
        if (head == null) {
            System.out.println("Doubly linked list is empty.");
            return;
        }

        Node current = head;
        System.out.print("Forward traversal: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void traverseBackward() {
        if (head == null) {
            System.out.println("Doubly linked list is empty.");
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        System.out.print("Backward traversal: ");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Practice_Project007 list = new Practice_Project007();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        list.traverseForward();
        list.traverseBackward();
    }
}

