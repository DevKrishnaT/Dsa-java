package LinkedList.LinkedlistRevision.Implementation;

class ListNode {
    int value;
    ListNode next;

    ListNode(int data) {
        value = data;
    }

    void treversal(ListNode node) {
        ListNode curr = node;

        while (curr != null) {
            System.out.print(curr.value + "-> ");
            curr = curr.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public ListNode insertAtStart(ListNode head, int value) {
        ListNode newNode = new ListNode(value);

        if (head == null) {
            head = newNode;
            return head;
        }

        newNode.next = head;
        return newNode;
    }

    public ListNode DeleteNode(ListNode node, int value) {
        if (node.value == value) {
            return node.next;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = node;

        ListNode curr = dummy;
        while (curr.next != null && curr.next.value != value) {
            curr = curr.next;
        }

        if (curr.next != null) {
            curr.next = curr.next.next;
        }

        return dummy.next;
    }

    public ListNode midddle(ListNode head) {
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

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
    }

    public boolean isCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

}

public class SinglyLinkedlist {
    static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);

        head.treversal(head);


    }
}
