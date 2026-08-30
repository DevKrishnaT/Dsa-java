package QuickRevision;

import java.util.LinkedList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    static void traverse(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}

public class ReverseList {
    static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode reverse = reverseList(head);
        ListNode.traverse(reverse);
    }

    private static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }


        ListNode curr = head;
        ListNode prev = null;

        while (curr.next != null) {
            ListNode next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;

        }
        curr.next = prev;


        return curr;


    }
}
