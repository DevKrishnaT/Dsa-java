package Revision.linkedlist;

public class swapPairs {
    static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(15);
        head.next.next = new Node(20);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(40);
        head.next.next.next.next.next = new Node(50);
        head.next.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next.next = new Node(70);
        head = swap(head);
    }

    private static Node swap(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node dummy = new Node(-1);
        dummy.next = head;
        Node prev = dummy;
        Node curr = head;


        while (curr != null && curr.next != null) {
            Node first = curr;
            Node sec = curr.next;
            Node nextPair = sec.next;

            prev.next = sec;
            sec.next = first;
            first.next = nextPair;

            prev = first;
            curr = nextPair;
        }
        return dummy.next;

    }


}
