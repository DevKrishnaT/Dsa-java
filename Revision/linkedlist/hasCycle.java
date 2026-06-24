package Revision.linkedlist;

public class hasCycle {
    static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(15);
        head.next.next = new Node(20);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(40);
        head.next.next.next.next.next = new Node(50);
        head.next.next.next.next.next.next = head.next.next;
        System.out.println(hasCycleDetect(head));
        System.out.println(CyclePoint(head).val);
    }

    public static boolean hasCycleDetect(Node head) {
        if (head == null || head.next == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static Node CyclePoint(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node turtle = head;
        Node rabbit = head;

        while (rabbit != null && rabbit.next != null) {
            turtle = turtle.next;
            rabbit = rabbit.next.next;

            if (turtle == rabbit) {
                Node ptr = head;
                while (ptr != turtle) {
                    ptr = ptr.next;
                    turtle = turtle.next;
                }

                return ptr;
            }
        }
        return null;
    }
}
