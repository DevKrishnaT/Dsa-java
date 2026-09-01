package QuickRevision;

class QueueLinkedList {

    LinkedList list;

    QueueLinkedList() {
        list = new LinkedList();
    }

    void enqueue(int value) {
        list.addLast(value);
    }

    int dequeue() {
        return list.removeFirst();
    }

    int peek() {
        return list.get(0);
    }

    boolean isEmpty() {
        return list.isEmpty();
    }

    int size() {
        return list.size();
    }

    void display() {
        list.treverse();
    }
}

public class QueueUsingLinkedlist {
    static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        System.out.println(queue.peek());
        queue.display();
    }
}
