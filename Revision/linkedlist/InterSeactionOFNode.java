package Revision.linkedlist;

import java.util.HashSet;

public class InterSeactionOFNode {
    static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(15);
        head.next.next = new Node(20);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(40);
        head.next.next.next.next.next = new Node(50);
        head.next.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next.next = new Node(70);
        Node sec = new Node(3);
        sec.next = new Node(3);
        sec.next.next = new Node(3);
        sec.next.next.next = head.next.next.next.next.next;
        Node interSeaction = find(head, sec);
        System.out.println(interSeaction);
    }

    private static Node find(Node head, Node sec) {
        HashSet<Node> set = new HashSet<>();

        while (head != null) {
            set.add(head);
            head = head.next;
        }
        while (sec != null) {
            if (set.contains(sec)) return sec;

            sec = sec.next;
        }

        return null;
    }
}
