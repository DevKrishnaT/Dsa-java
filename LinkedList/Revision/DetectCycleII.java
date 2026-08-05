package LinkedList.Revision;

import static LinkedList.Revision.LinkedList.treverse;

public class DetectCycleII {
    static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);


        head.next.next.next.next = head.next;
        ListNode ansNode = detectCycle(head);
        
    }

    private static ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                ListNode ptr = head;
                while (ptr != slow) {
                    slow = slow.next;
                    ptr = ptr.next;
                }
                return ptr;
            }

        }

        return null;
    }
}
