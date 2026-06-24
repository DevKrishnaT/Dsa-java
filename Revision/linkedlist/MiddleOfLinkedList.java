package Revision.linkedlist;

public class MiddleOfLinkedList {
    static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(15);
        head.next.next = new Node(20);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(40);
        head.next.next.next.next.next = new Node(50);
        head.next.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next.next = new Node(70);
        Print(head);
        System.out.println(MiddleOfLinkedList(head).val);
    }

    public static void Print(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.print("null");
    }

    public static Node MiddleOfLinkedList(Node head) {
        if (head == null) {
            return null;
        }

        Node curr = head;
        Node middle = head;
        int length = 0;

        while (curr != null) {

            if (length % 2 != 0) {
                middle = middle.next;
            }
            length += 1;

            curr = curr.next;


        }

        return middle;
    }
}
