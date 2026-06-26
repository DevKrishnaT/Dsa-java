package Revision.linkedlist;

public class segrigateLinkedList {
    static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(15);
        head.next.next = new Node(20);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(40);
        head.next.next.next.next.next = new Node(50);
        head.next.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next.next = new Node(70);

        Node ans = oddEvenList(head);
        print(ans);
    }

    private static Node oddEvenList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node oddDummy = new Node(0);
        Node EvenDummy = new Node(0);

        Node Eventail = EvenDummy;
        Node Oddtail = oddDummy;

        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = null;

            if (curr.val % 2 == 0) {
                Eventail.next = curr;
                Eventail = curr;
            } else {
                Oddtail.next = curr;
                Oddtail = curr;
            }

            curr = next;
        }

        Oddtail.next = EvenDummy.next;

        return oddDummy.next;


    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.val + " -> ");

            head = head.next;

        }
        System.out.print("null");
    }
}
