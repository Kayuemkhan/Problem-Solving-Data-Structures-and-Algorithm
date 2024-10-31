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
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

        System.out.println("******* Printing middle of the node *******");
        System.out.println(getMiddle(head));

        printNodes(head);
    }

    private static int getMiddle(Node head) {
        int getLength = getLengthOfLinkedList (head);


        int mid = getLength/2;

        while (mid >0){
            head = head.next;
            mid--;
        }

        return head.data;
    }

    private static int getLengthOfLinkedList(Node head) {

        int length =0;
        while (head!=null){
            length++;
            head = head.next;
        }

        return length;
    }

    private static void printNodes(Node node) {
        System.out.println();
        System.out.println("******* Printing full nodes *******");
        while(node !=null ){
            System.out.println(node.data);
            node = node.next;
        }

    }
}
