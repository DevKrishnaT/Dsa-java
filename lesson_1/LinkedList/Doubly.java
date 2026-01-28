package lesson_1.LinkedList;

class Node {
    Integer x;
    Node next;
    Node prev;

    Node(Integer x) {
        this.x = x;
        this.next = this.prev = null;
    }
}

class DoublyList {
    Node head = null;
    Node tail = null;

    public void PushFront(Integer x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = tail = newNode;
            return;

        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    public void PushBack(Integer x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;

    }

    public void PushtAtNth(Integer x, Integer n) {
        Node newList = new Node(x);
        if (n == 0) {
            if (head == null) {
                head = tail = newList;
            } else {
                head.prev = newList;
                newList.next = head;
                head = newList;
            }
            return;
        }

        Node current = head;

        for (int i = 0; i < n - 1; i++) {
            if (current == null) {
                return;
            }
            current = current.next;

        }

        if (current.next == null) {
            current.next = newList;
            newList.next = current;
            tail = newList;
            return;
        }

        newList.next = current.next;
        newList.prev = current;
        current.next.prev = newList;
        current.next = newList;
    }

    public void popFront() {
        if (head == null) {
            return;
        }

        if (head == tail) {
            head = tail = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    public void delete() {
        if (head == null) {
            return;
        }
        if (head == tail) {
            head = tail = null;
            return;
        }

        tail = tail.prev;
        tail.next = null;
    }

    public void deletnth(int n) {
        if (head == null) return;

        if (n == 0) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            return;
        }
        Node curr = head;

        for (int i = 0; i < n - 1; i++) {
            if (curr == null) return;
            curr = curr.next;
        }

        if (curr == tail) {
            tail = tail.prev;
            tail.next = null;
            return;
        }

        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;
    }

    public void Treverse() {
        if (head == null) {

            System.out.println("push somthing");
            return;
        }

        Node Curr = head;

        while (Curr != null) {

            System.out.print(Curr.x + " ->");
            Curr = Curr.next;
        }
        System.out.println();
    }
}

public class Doubly {
    public static void main(String[] args) {
        DoublyList list = new DoublyList();
        list.PushFront(10);
        list.PushFront(80);
        list.PushFront(50);
        list.PushFront(40);
        list.PushFront(30);
        list.Treverse();
        list.PushBack(45);
        list.PushBack(84);
        list.PushBack(65);
        list.Treverse();
        list.PushtAtNth(999, 0);
        list.Treverse();
    }
}
