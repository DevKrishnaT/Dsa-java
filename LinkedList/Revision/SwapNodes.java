package LinkedList.Revision;

import static LinkedList.Revision.LinkedList.treverse;

public class SwapNodes {
    static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode ansNode = swapPairs(head);
        treverse(ansNode);
    }

    private static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(-1);

        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null && curr.next != null) {
            ListNode first = curr;
            ListNode sec = first.next;
            ListNode nextPair = sec.next;

            prev.next = sec;
            sec.next = first;
            first.next = nextPair;

            prev = first;
            curr = nextPair;
        }
        return dummy.next;
    }
}
