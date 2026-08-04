package LinkedList.Revision;

import java.util.HashSet;

import static LinkedList.Revision.LinkedList.treverse;

public class RemoveDuplicates {
    static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);
        ListNode ans = deleteDuplicates(head);
        treverse(ans);
    }

    private static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = head;
        ListNode prev = dummy;


        while (curr != null) {
            if (curr.next != null && curr.val == curr.next.val) {
                int val = curr.val;
                while (curr != null && curr.val == val) {
                    curr = curr.next;
                }

                prev.next = curr;
            } else {
                prev = curr;
                curr = curr.next;
            }

        }
        return dummy.next;
    }
}
