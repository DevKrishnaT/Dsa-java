package QuickRevision;

public class RemoveNthFromEnd {
    static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 3;
        ListNode ans = removeNthFromEnd(head, n);
        ListNode.traverse(ans);
    }

    private static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        while (n >= 0) {
            fast = fast.next;
            n--;
        }


        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;


        return dummy.next;

    }
}
