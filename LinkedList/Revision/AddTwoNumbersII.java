package LinkedList.Revision;

import static LinkedList.Revision.LinkedList.treverse;

public class AddTwoNumbersII {
    static void main(String[] args) {
        ListNode l1 = new ListNode(7);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode ans = addtwoNumbersII(l1, l2);
        treverse(ans);
    }

    private static ListNode addtwoNumbersII(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);


        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        int carry = 0;

        while (l1 != null || l2 != null) {
            int sum = carry;

            if (l1 != null) sum += l1.val;
            if (l2 != null) sum += l2.val;

            ListNode newNode = new ListNode(sum % 10);

            carry = sum / 10;
            curr.next = newNode;
            curr = curr.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;


        }

        if (carry > 0) curr.next = new ListNode(carry);


        return reverse(dummy.next);
    }

    private static ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
