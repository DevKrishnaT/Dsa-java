package Revision.linkedlist;

import static Revision.linkedlist.segrigateLinkedList.print;

public class mergeSorteList {
    static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);

        Node sec = new Node(1);
        sec.next = new Node(1);
        sec.next.next = new Node(2);
        Node ans = merge(head, sec);
        print(ans);
    }

    private static Node merge(Node first, Node sec) {
        Node dummy = new Node(-1);
        Node curr = dummy;

        while (first != null && sec != null) {
            if (first.val <= sec.val) {
                curr.next = first;
                first = first.next;

            } else {
                curr.next = sec;
                sec = sec.next;
            }
            curr = curr.next;
        }

        if (first == null) {
            curr.next = sec;
        } else {
            curr.next = first;
        }

        return dummy.next;
    }
}
