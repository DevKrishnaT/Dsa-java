package LinkedList.Revision;

import static LinkedList.Revision.LinkedList.treverse;

public class ReverseLinkedList2 {
    static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);
        head.next.next.next.next.next = new ListNode(60);
        int left = 2;
        int right = 4;
        ListNode newHead = reverseBetween(head, left, right);
        treverse(newHead);
    }

    private static ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null || left == right) {
            return head;
        }

        ListNode curr = head;
        int i = 1;
        ListNode prev = null;
        while (curr != null && i < left) {
            prev = curr;
            curr = curr.next;
            i++;
        }

        ListNode prevPointer = prev;
        ListNode start = curr;

        prev = null;
        while (curr != null && i != right + 1) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            i++;
        }

        start.next = curr;
        if (prevPointer != null) {
            prevPointer.next = prev;
        } else {
            return prev;
        }
        return head;
    }
}
