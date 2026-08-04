package LinkedList.Revision;

import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedList {
    static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);
        head.next.next.next.next.next = new ListNode(60);
        treverse(head);
        ListNode mid = MidFinder(head);
        System.out.println(mid.val);
    }

    private static ListNode MidFinder(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;


    }

    static void treverse(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + "-> ");
            curr = curr.next;
        }

    }

}
