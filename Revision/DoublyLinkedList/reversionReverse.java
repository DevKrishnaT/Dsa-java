package Revision.DoublyLinkedList;

import static Revision.DoublyLinkedList.Implementation.print;

public class reversionReverse {
    static void main(String[] args) {
        DNode head = new DNode(5);
        head.next = new DNode(10);
        head.next.prev = head;
        head.next.next = new DNode(20);
        head.next.next.prev = head.next;
        print(head);
        head = revers(head);
        print(head);
    }

    private static DNode revers(DNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        DNode curr = head;
        DNode newNode = null;
        while (curr != null) {
            DNode next = curr.next;
            curr.next = curr.prev;
            curr.prev = next;

            newNode = curr;
            curr = next;
        }
        return newNode;
    }
}
