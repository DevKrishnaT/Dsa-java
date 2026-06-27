package Revision.linkedlist;

public class RotateListRight {
    static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(15);
        head.next.next = new Node(20);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(40);
        head.next.next.next.next.next = new Node(50);
        head.next.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next.next = new Node(70);

        int k = 10;
        head = StartRoatate(head, k);
        Print(head);
    }

    private static Node StartRoatate(Node head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        int length = findLength(head);
        k %= length;

        if (k == 0)
            return head;
        int skipNode = length - k;


        Node dummy = new Node(-1);
        dummy.next = head;
        Node curr = dummy;

        while (skipNode > 0) {
            curr = curr.next;
            skipNode--;
        }
        Node RotateHead = curr.next;
        curr.next = null;

        Node TailFinder = RotateHead;
        while (TailFinder.next != null) {
            TailFinder = TailFinder.next;
        }

        TailFinder.next = dummy.next;

        return RotateHead;
    }

    public static void Print(Node head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.print("null");

    }

    private static int findLength(Node head) {
        if (head == null) {
            return 0;
        }
        return findLength(head.next) + 1;
    }


}
