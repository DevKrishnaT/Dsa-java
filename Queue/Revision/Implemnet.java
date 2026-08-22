package Queue.Revision;

class DoubleQueue {
    private int capacity;
    private int size;
    private int front;
    private int rear;
    private int[] arr;

    DoubleQueue(int size) {
        capacity = size;
        arr = new int[capacity];
        front = rear = -1;
        this.size = 0;
    }

    void insertFront(int x) {
        if (isFull()) {
            System.out.println("queue is full");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {

            front = (front - 1 + capacity) % capacity;
        }


        arr[front] = x;
        size++;
    }

    void insertAtEnd(int x) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {

            rear = (rear + 1) % capacity;
        }

        arr[rear] = x;
        size++;
    }

    int deleteFront() {
        if (isEmpty()) {
            return -1;
        }
        int curr = arr[front];
        if (size == 1) {
            front = rear = -1;
        } else {

            front = (front + 1) % size;
        }
        size--;
        return curr;
    }

    int deleteRear() {
        if (isEmpty()) {
            return -1;
        }

        int curr = arr[rear];
        if (size == 1) {
            front = rear = -1;
        } else {

            rear = (rear - 1 + capacity) % capacity;
        }


        return curr;
    }

    boolean isFull() {
        return size == capacity;
    }

    boolean isEmpty() {
        return size == 0;
    }
}

public class Implemnet {
    static void main(String[] args) {
        DoubleQueue DeQueue = new DoubleQueue(5);
        DeQueue.insertFront(1);
        DeQueue.insertFront(2);
        DeQueue.insertFront(3);
        DeQueue.insertAtEnd(5);
        System.out.println(DeQueue.deleteRear());
        System.out.println(DeQueue.deleteFront());
        ;

    }
}
