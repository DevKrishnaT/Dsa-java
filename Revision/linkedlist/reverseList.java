package Revision.linkedlist;

public class reverseList {
    static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(15);
        head.next.next = new Node(20);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(40);
        head.next.next.next.next.next = new Node(50);
        head.next.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next.next = new Node(70);
        Print(head);
        head = reverse(head);
        Print(head);
        head = ReverseRecursion(head);
        Print(head);
    }

    private static Node ReverseRecursion(Node head) {
        if (head == null || head.next == null) {
            return head;
        }


        Node CurrPrev = null;
        Node curr = head;

        return solve(CurrPrev, curr);
    }

    private static Node solve(Node currPrev, Node curr) {
        if (curr == null) {
            return currPrev;
        }

        Node next = curr.next;
        curr.next = currPrev;
        return solve(curr, next);

    }

    private static Node reverse(Node head) {

        if (head == null || head.next == null) {
            return head;
        }


        Node CurrPrev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = CurrPrev;
            CurrPrev = curr;


            curr = next;
        }

        return CurrPrev;

    }


    public static void Print(Node head) {
        Node temp = head;

        while (temp != null) {

            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.print("null");
        System.out.println();
    }
}
