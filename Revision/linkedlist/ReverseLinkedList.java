package Revision.linkedlist;

public class ReverseLinkedList {
    static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(15);
        head.next.next = new Node(20);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(40);
        head.next.next.next.next.next = new Node(50);
        head.next.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next.next = new Node(70);
        head = reverse(head);
        Print(head);
    }

    private static Node reverse(Node head) {
        Node curr = head;

        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;

            curr = next;
        }
        return prev;
    }

    public static void Print(Node head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.print("null");

    }
}
