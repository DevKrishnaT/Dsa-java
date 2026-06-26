package Revision.linkedlist;

public class segrigateOddEvenindex {
    static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(15);
        head.next.next = new Node(20);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(40);
        head.next.next.next.next.next = new Node(50);
        head.next.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next.next = new Node(70);

        Node ans = oddEvenIndexList(head);
        print(ans);
    }

    private static Node oddEvenIndexList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node evenDummy = new Node(0);
        Node oddDummy = new Node(0);

        Node oddtail = oddDummy;
        Node eventail = evenDummy;

        Node curr = head;
        int index = 0;

        while (curr != null) {
            Node next = curr.next;
            curr.next = null;

            if (index % 2 == 0) {
                eventail.next = curr;
                eventail = curr;
            } else {
                oddtail.next = curr;
                oddtail = curr;
            }

            index += 1;
            curr = next;
        }

        eventail.next = oddDummy.next;

        return evenDummy.next;
    }

    public static void print(Node node) {
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }

        System.out.print("null");
    }
}
