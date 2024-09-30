package dataStructures.linked_list.problems;

public class FindMiddleOfTheLinkedList {
    static class Node {
        int data;
        Node next;

        // Constructor to initialize a new node with data
        Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node node = new Node(10);
        node.next = new Node(20);

        printNodes(node);
    }

    private static void printNodes(Node node) {

    }
}
