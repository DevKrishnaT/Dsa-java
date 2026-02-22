package LinkedList;

class list {
    ListNode head = null;

    class ListNode {
        Integer x;
        ListNode next;

        ListNode(Integer x) {
            this.x = x;
            this.next = null;
        }
    }

    public void add(Integer x) {
        ListNode newNode = new ListNode(x);
        if (head == null) {
            head = newNode;
            return;
        }

        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
    }

    public void reverse() {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;
    }

    public ListNode reverserecursive(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode newNode = reverserecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newNode;
    }
}

public class ReveserSingly {
    public static void main(String[] args) {

    }
}
