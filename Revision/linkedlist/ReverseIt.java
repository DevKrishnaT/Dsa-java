package Revision.linkedlist;

import static Revision.linkedlist.reverseKGroup.print;

public class ReverseIt {
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
        print(head);
        head = reverseRecursion(head);
        print(head);
    }

    private static Node reverseRecursion(Node head) {
        return solve(head, null);
    }

    private static Node solve(Node head, Node prev) {
        if (head == null) {
            return prev;
        }

        Node next = head.next;
        head.next = prev;
        return solve(next, head);
    }

    private static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
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
}
