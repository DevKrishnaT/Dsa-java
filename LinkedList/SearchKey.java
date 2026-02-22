package LinkedList;

import java.util.Objects;

class Search {
    Node head = null;

    class Node {
        Integer x;
        Node next;

        Node(Integer x) {
            this.x = x;
            this.next = null;
        }
    }

    public void add(Integer x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        ;
    }

    public boolean Search(Integer x) {
        Node current = head;

        while (current != null) {
            if (Objects.equals(current.x, x)) {
                return true;
            }
            current = current.next;
        }
        return false;

    }
}

public class SearchKey {
    public static void main(String[] args) {
        Search list = new Search();

        list.add(2);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        boolean ans = list.Search(2);
        System.out.println(ans);

    }
}
