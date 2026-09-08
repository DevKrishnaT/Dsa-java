package Queue.Implementation.Revision;

class cirQueue {
    int[] arr;
    int front;
    int rear;
    int size;
    int capacity;

    cirQueue(int size) {
        arr = new int[size];
        capacity = size;
        this.size = 0;
        front = 0;
        rear = -1;
    }

    void addLast(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = value;
        size++;

    }

    void addFirst(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        arr[front] = value;

        front = (front - 1 + capacity) % capacity;
        size++;

        if (size == 1) {
            rear = front;
        }
    }

    int removeFirst() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }


        int value = arr[front];

        if (size == 1) {
            front = 0;
            rear = -1;
            size = 0;
        }

        front = (front + 1) % capacity;
        size--;

        return value;

    }

    int removeLast() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int value = arr[rear];

        if (size == 1) {
            front = 0;
            rear = -1;
            size = 0;
        }

        rear = (rear - 1 + capacity) % capacity;
        size--;

        return value;
    }

    boolean isFull() {
        return size == capacity;
    }

    boolean isEmpty() {
        return size == 0;
    }
}

public class CirQueueImplementation {
    static void main(String[] args) {

    }
}
