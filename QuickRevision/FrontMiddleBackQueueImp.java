package QuickRevision;

class FrontMiddleBackQueue {
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public FrontMiddleBackQueue() {
        head = null;
        tail = null;
        size = 0;

    }

    public void pushFront(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void pushMiddle(int val) {
        Node newNode = new Node(val);

        if (size == 0) {
            head = tail = newNode;
        } else if (size == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node curr = head;


            int steps = (size - 1) / 2;

            for (int i = 0; i < steps; i++) {
                curr = curr.next;
            }

            newNode.next = curr.next;
            curr.next = newNode;
        }

        size++;
    }

    public void pushBack(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public int popFront() {
        if (size == 0) {
            return -1;
        }
        int value = head.value;
        if (size == 1) {
            head = tail = null;
        } else {
            head = head.next;
        }
        size--;
        return value;
    }

    public int popMiddle() {
        if (size == 0) {
            return -1;
        }

        if (size == 1) {
            int value = head.value;
            head = tail = null;
            size--;
            return value;
        }

        Node curr = head;


        int steps = (size - 3) / 2;

        for (int i = 0; i < steps; i++) {
            curr = curr.next;
        }

        int value = curr.next.value;
        curr.next = curr.next.next;

        size--;

        return value;

    }

    public int popBack() {
        if (size == 0) {
            return -1;
        }

        int value = tail.value;
        if (size == 1) {
            head = tail = null;
        } else {
            Node curr = head;
            while (curr.next != tail) {
                curr = curr.next;
            }
            tail = curr;
            tail.next = null;
        }


        size--;
        return value;
    }

    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }


    }
}

public class FrontMiddleBackQueueImp {
    static void main(String[] args) {
        FrontMiddleBackQueue queue = new FrontMiddleBackQueue();
        queue.pushFront(10);
        queue.pushBack(30);
        queue.pushMiddle(20);
        queue.display();
    }
}
