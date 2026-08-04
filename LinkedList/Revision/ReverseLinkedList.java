package LinkedList.Revision;

import static LinkedList.Revision.LinkedList.treverse;

public class ReverseLinkedList {
    static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);
        head.next.next.next.next.next = new ListNode(60);
        ListNode rev = reverseList(head);
        treverse(rev);
    }

    private static ListNode reverseList(ListNode head) {
        return solve(null, head);
    }

    private static ListNode solve(ListNode prev, ListNode curr) {
        if (curr == null) {
            return prev;
        }

        ListNode next = curr.next;
        curr.next = prev;

        return solve(curr, next);
    }
}
