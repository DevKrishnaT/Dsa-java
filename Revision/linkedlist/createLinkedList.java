package Revision.linkedlist;

class Node {
    int val;
    Node next;

    Node(int value) {
        this.val = value;
    }
}

public class createLinkedList {
    static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head = insertAtEnd(head, 40);
        head = insertAtEnd(head, 50);
        PrintLinkedlist(head);

    }

    public static Node insertAtEnd(Node head, int value) {
        Node tail = new Node(value);
        if (head == null) {
            return tail;

        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = tail;

        }
        return head;
    }

    public static void PrintLinkedlist(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }

        System.out.print("null");
    }


}


