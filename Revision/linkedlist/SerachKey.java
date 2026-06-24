package Revision.linkedlist;

public class SerachKey {
    static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        boolean ans = searchKey(head, 5);
        System.out.println(ans);
    }

    private static boolean searchKey(Node head, int key) {
        if (head == null) {
            return false;
        }

        Node temp = head;
        while (temp != null) {
            if (temp.val == key) {
                return true;
            }
            temp = temp.next;
        }

        return false;
    }


}
