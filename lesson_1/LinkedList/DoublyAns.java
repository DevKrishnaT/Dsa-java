package lesson_1.LinkedList;

import java.util.Objects;

class DoublylikedList {
    Node head = null;
    Node tail = null;

    class Node {
        Integer x;

        Node next;
        Node prev;

        Node(Integer x) {
            this.x = x;
            this.next = this.prev = null;
        }
    }

    public void add(Integer x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void Trevers() {
        if (head == null) {
            System.out.println("nothing in it");
            return;
        }

        Node curr = head;

        while (curr != null) {
            System.out.print(curr.x + " ->");
            curr = curr.next;
        }
    }

    public void deleteAllOccurOfX(Integer x) {
        while (head != null && Objects.equals(head.x, x)) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        }

        if (head == null) return;

        Node curr = head;
        while (curr.next != null) {
            if (Objects.equals(curr.next.x, x)) {
                Node toDelete = curr.next;
                curr.next = toDelete.next;
                if (toDelete.next != null) {
                    toDelete.next.prev = curr;
                } else {
                    tail = curr;
                }
            } else {
                curr = curr.next;
            }
        }
    }

    public void removeDup(Integer x) {
        if (head == null || head.next == null) {
            return;
        }

        Node curr = head;

        while (curr != null && curr.next != null) {
            if (Objects.equals(curr.x, curr.next.x)) {
                Node toDelete = curr.next;
                curr.next = toDelete.next;

                if (toDelete.next != null) {
                    toDelete.next.prev = curr;
                }
            } else {
                curr = curr.next;
            }
        }
        return;
    }

}

public class DoublyAns {
    static void main(String[] args) {
        DoublylikedList newList = new DoublylikedList();
        newList.add(1);

        newList.deleteAllOccurOfX(1);
        newList.Trevers();

    }
}
