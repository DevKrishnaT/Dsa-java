package lesson_1.LinkedList;

import java.util.Objects;

class listoooo {
    Node headA = null;
    Node headB = null;

    class Node {
        Integer x;
        Node next;

        Node(Integer x) {
            this.x = x;
            this.next = null;
        }
    }

    public void addA(Integer x) {
        Node newNode = new Node(x);
        if (headA == null) {
            headA = newNode;
            return;
        }


        Node curr = headA;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void addB(Integer x) {
        Node newNode = new Node(x);
        if (headB == null) {
            headB = newNode;
            return;
        }


        Node curr = headB;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public Node InterSection() {
        if (headA == null || headB == null) return null;

        Node pA = headA;
        Node pB = headB;

        while (pA != pB) {
            pA = (pA == null) ? headB : pA.next;
            pB = (pB == null) ? headA : pB.next;
        }

        return pA;
    }
}

public class InterSeaction {
    public static void main(String[] args) {

        listoooo list = new listoooo();
        list.addA(1);
        list.addA(2);
        list.addA(3);
        list.addA(4);
        list.addB(4);
    }
}
