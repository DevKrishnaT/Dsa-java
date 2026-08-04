package LinkedList.Revision;

import java.util.Arrays;
import java.util.HashSet;

import static LinkedList.Revision.LinkedList.treverse;

public class ModifiedList {
    static void main(String[] args) {
        int[] nums = {1, 2, 3};
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode newHead = modifiedList(head, nums);
        treverse(newHead);
    }

    private static ListNode modifiedList(ListNode head, int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = head;
        ListNode prev = dummy;

        while (curr != null) {
            if (set.contains(curr.val)) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }

            curr = curr.next;
        }

        return dummy.next;
    }
}
