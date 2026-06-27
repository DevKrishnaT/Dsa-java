package Revision.linkedlist;

import java.util.HashSet;

public class deleteDuplicates {
    static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head = removedup(head);
        print(head);
    }

    private static Node removedup(Node head) {
        HashSet<Integer> ht = new HashSet<>();

        Node curr = head;
        Node prev = null;

        while (curr != null) {
            if (ht.contains(curr.val)) {
                prev.next = curr.next;

            } else {
                prev = curr;
                ht.add(curr.val);
                
            }
            curr = curr.next;
        }

        return head;
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
