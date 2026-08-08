package LinkedList.Revision;

import java.util.List;

import static LinkedList.Revision.LinkedList.treverse;

public class MergeKLists {
    static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        ListNode[] lists = {l1, l2, l3};

        ListNode ans = mergeKLists(lists);
        treverse(ans);
    }

    private static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }


        return devide(lists, 0, lists.length - 1);
    }

    private static ListNode devide(ListNode[] lists, int left, int right) {

        if (left == right) {
            return lists[left];
        }

        int mid = left + (right - left) / 2;

        ListNode l1 = devide(lists, left, mid);
        ListNode l2 = devide(lists, mid + 1, right);

        return mergeTwo(l1, l2);
    }

    private static ListNode mergeTwo(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }

            curr = curr.next;
        }

        if (l1 != null) curr.next = l1;
        if (l2 != null) curr.next = l2;

        return dummy.next;
    }
}
