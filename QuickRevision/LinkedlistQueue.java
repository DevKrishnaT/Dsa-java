package QuickRevision;

class LinkedList {

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

    LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    void addFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        size++;
    }

    int removeFirst() {
        if (head == null) {
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

    int removeLast() {
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

    void addLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    int remove(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        if (index == 0) {

            return removeFirst();
        }

        if (index == size - 1) {
            return removeLast();
        }

        Node curr = head;

        while (index - 1 > 0) {
            curr = curr.next;
            index--;
        }
        int value = curr.next.value;
        curr.next = curr.next.next;
        size--;
        return value;

    }


    void add(int index, int value) {
        if (index < 0 || index > size) {
            return;
        }

        if (index == 0) {
            addFirst(value);
            return;
        }

        if (index == size) {
            addLast(value);
            return;
        }


        Node newNode = new Node(value);

        Node curr = head;

        while (index - 1 > 0) {
            curr = curr.next;
            index--;
        }

        Node nextNode = curr.next;
        curr.next = newNode;
        newNode.next = nextNode;
        size++;

    }

    int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        
        if (index == size - 1) {
            return tail.value;
        }
        Node curr = head;

        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        return curr.value;
    }

    boolean contains(int value) {

        Node curr = head;

        while (curr != null) {
            if (curr.value == value) {
                return true;
            }

            curr = curr.next;
        }
        return false;
    }

    boolean isEmpty() {
        return size == 0;
    }

    int size() {
        return size;
    }

    void treverse() {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }

    }

}

public class LinkedlistQueue {
    static void main(String[] args) {
        LinkedList queue = new LinkedList();

        queue.addFirst(2);
        queue.addFirst(1);
        queue.addLast(4);
        queue.add(2, 3);
        queue.treverse();
    }
}
