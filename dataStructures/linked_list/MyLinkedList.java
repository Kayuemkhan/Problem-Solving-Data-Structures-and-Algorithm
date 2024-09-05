package dataStructures.linked_list;

class MyLinkedList {

    Node root;

    static class Node {
        int val;
        Node next;
        public Node(int value) {
            val = value;
            next = null;
        }
    }

    /** Initialize your data structure here. */
    public MyLinkedList() {
        root = null;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        //printList("get index = " + index);
        if (index < 0 || root == null) return -1;
        Node cur = root;

        while (index > 0 && cur != null) {
            cur = cur.next;
            --index;
        }
        return (cur != null && index == 0) ? cur.val : -1;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        //printList("add at head start val = " + val);
        if (root == null) root = new Node(val);
        else {
            Node newNode = new Node(val);
            newNode.next = root;
            root = newNode;
        }
        //printList("add at head end");
    }

    public void printList(String s) {
        Node cur = root;
        System.out.print(s + " : ");
        while (cur != null) {
            System.out.print(" " + cur.val);
            cur = cur.next;
        }
        System.out.println();
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        //printList("addAtTail val = " + val);
        if (root == null) root = new Node(val);
        else {
            Node cur = root;

            while (cur.next != null && cur.next.next != null) {
                cur = cur.next;
            }

            if (cur.next != null && cur.next.next == null)
                cur.next.next = new Node(val);
            else
                cur.next = new Node(val);
        }

        //printList("addAtTail");
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        //printList("addAtIndex index = " + index + " val = " + val);
        Node cur;
        if (index == 0) {
            cur = new Node(val);
            cur.next = root;
            root = cur;
        } else if (index > 0) {
            cur = root;

            while (index-- > 1 && cur != null) cur = cur.next;

            if(cur != null) {
                Node newNode = new Node(val);
                newNode.next = cur.next;
                cur.next = newNode;
            }
        }
        //printList("addAtIndex end");
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        //printList("deleteAtIndex index = " + index);
        if (index == 0) {
            root = root.next;
        } else if (index > 0) {
            Node cur = root;

            while (index-- > 1 && cur.next != null) {
                cur = cur.next;
            }

            if (cur != null && cur.next != null) {
                cur.next = cur.next.next;
            }
        }
        //printList("deleteAtIndex");
    }
}