package lesson_1.LinkedList;

import java.util.Iterator;

class LinkedListLL {
    ListNode head = null;

    class ListNode {
        Integer x;
        ListNode next;

        ListNode(Integer x) {
            this.x = x;
            this.next = null;
        }
    }

    public void add(Integer x) {
        ListNode newNode = new ListNode(x);
        if (head == null) {
            head = newNode;
            return;
        }

        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public ListNode oddEvenList() {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
    }

    public void Treversal() {
        if (head == null) {
            return;
        }
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.x + " ->");
            curr = curr.next;
        }
    }


}

public class OddEvenList {
    public static void main(String[] args) {
        LinkedListLL newNode = new LinkedListLL();
        newNode.add(2);
        newNode.add(1);
        newNode.add(3);
        newNode.add(5);
        newNode.add(6);
        newNode.add(4);
        newNode.add(7);
        newNode.oddEvenList();

        newNode.Treversal();


    }
}
