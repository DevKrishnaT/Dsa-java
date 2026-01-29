package lesson_1.LinkedList;

class linkedList {
    Node head = null;

    class Node {
        Integer x;
        Node next;

        Node(Integer x) {
            this.x = x;
            this.next = null;
        }
    }

    public int length() {
        Node curr = head;
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }

        return count;
    }

    public void addlast(Integer x) {
        Node newnode = new Node(x);
        if (head == null) {
            head = newnode;
            return;
        }

        Node curr = head;


        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newnode;
    }

    public Node middleNode(Integer x) {
        Node curr = head;
        for (int i = 0; i < x; i++) {
            curr = curr.next;
        }
        System.out.println(curr.x);
        return curr;


    }

    public void reverse() {
        Node curr = head;
        while (curr != null) {
            
        }
    }
}

public class FindMiddle {
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.addlast(4);
        ll.addlast(5);
        ll.addlast(6);


        int legth = ll.length();
        int mid = legth / 2;
        ll.middleNode(mid);


    }
}
