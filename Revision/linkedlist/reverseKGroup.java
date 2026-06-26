package Revision.linkedlist;

public class reverseKGroup {
    static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(15);
        head.next.next = new Node(20);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(40);
        head.next.next.next.next.next = new Node(50);
        head.next.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next.next = new Node(70);
        head = reverse(head, 3);
        print(head);
    }

    private static Node reverse(Node head, int k) {

        Node dummy = new Node(-1);
        dummy.next = head;

        Node groupPrev = dummy;

        while (true) {


            Node kth = findKth(groupPrev, k);

            if (kth == null) {
                break;
            }
            Node groupNext = kth.next;

            Node prev = groupNext;
            Node curr = groupPrev.next;


            while (curr != groupNext) {
                Node temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            Node temp = groupPrev.next;
            groupPrev.next = kth;
            groupPrev = temp;
        }
        return dummy.next;
    }

    private static Node findKth(Node curr, int k) {

        while (curr != null && k > 0) {
            curr = curr.next;
            k--;
        }
        return curr;
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.print("null");
    }
}
