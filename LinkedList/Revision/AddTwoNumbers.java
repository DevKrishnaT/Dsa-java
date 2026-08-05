package LinkedList.Revision;

import static LinkedList.Revision.LinkedList.treverse;

public class AddTwoNumbers {
    static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        ListNode ans = sumOfList(l1, l2);
        treverse(ans);
    }

    private static ListNode sumOfList(ListNode l1, ListNode l2) {
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

        return dummy.next;
    }
}
