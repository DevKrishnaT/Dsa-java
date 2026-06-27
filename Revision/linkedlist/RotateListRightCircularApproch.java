package Revision.linkedlist;

public class RotateListRightCircularApproch {
    static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(15);
        head.next.next = new Node(20);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(40);
        head.next.next.next.next.next = new Node(50);
        head.next.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next.next = new Node(70);
        int k = 6;
        head = find(head, k);
    }

    private static Node find(Node head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        int length = 1;
        Node oldTail = head;
        while (oldTail.next != null) {
            length++;
            oldTail = oldTail.next;
        }
        k = k % length;
        if (k == 0) {
            return head;
        }
        oldTail.next = head;

        int steps = length - k - 1;
        Node newTail = oldTail.next;
        while (steps > 0) {
            newTail = newTail.next;
            steps--;
        }

        Node newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }
}
