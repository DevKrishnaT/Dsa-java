package lesson_1.LinkedList;

class SortedList {
    Node head1 = null;
    Node head2 = null;

    class Node {
        Integer data;
        Node next;

        Node(Integer data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add1(Integer n) {
        Node newNode = new Node(n);
        if (head1 == null) {
            head1 = newNode;
            return;
        }

        Node temp = head1;

        while (temp.next != null) {
            temp = temp.next;

        }
        temp.next = newNode;

    }

    public void add2(Integer n) {
        Node newNode = new Node(n);
        if (head2 == null) {
            head2 = newNode;
            return;
        }

        Node temp = head2;

        while (temp.next != null) {
            temp = temp.next;

        }
        temp.next = newNode;

    }

    public Node mergeBoth() {
        Node dummy = new Node(0);
        Node curr = dummy;

        Node h1 = head1;
        Node h2 = head2;

        while (h1 != null && h2 != null) {
            if (h1.data <= h2.data) {
                curr.next = h1;
                h1 = h1.next;
            } else {
                curr.next = h2;
                h2 = h2.next;
            }
            curr = curr.next;
        }


        if (h1 != null) {
            curr.next = h1;
        } else {
            curr.next = h2;
        }

        return dummy.next;
    }


    public void Treverse() {
        if (head1 == null) {
            return;
        }

        Node temp = head1;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


}

public class mergetwoSortedlist {
    static void main(String[] args) {
        SortedList ll = new SortedList();
        ll.add2(1);
        ll.add2(2);
        ll.add2(3);
        ll.add2(4);
        ll.add2(5);
        ll.add1(8);
        ll.add1(23);
        ll.add1(32);
        ll.add1(214);
        ll.add1(329);
        ll.mergeBoth();
        ll.Treverse();

    }


}
