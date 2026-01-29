package lesson_1.LinkedList;

class cycledlist {
    ListNode head = null;

    class ListNode {
        Integer x;
        ListNode next;

        ListNode(Integer x) {
            this.x = x;
            this.next = null;
        }
    }

    public ListNode detectcycle() {
        if (head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                ListNode ptr = head;
                while (ptr != slow) {
                    ptr = ptr.next;
                    slow = slow.next;
                }
                return ptr;
            }
        }
        return null;

    }

    
}

public class DetectCycle {
}
