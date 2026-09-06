package Queue.Implementation;

class DeQueue {
    int[] arr;
    int capacity;
    int front;
    int rear;
    int size;

    DeQueue(int size) {
        capacity = size;
        this.size = 0;
        arr = new int[capacity];
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


        front = (front - 1 + capacity) % capacity;

        arr[front] = value;
        size++;
        if (size == 1) {
            rear = front;
        }
    }

    int removeLast() {
        if (isEmpty()) {
            return -1;
        }

        int value = arr[rear];
        if (size == 1) {
            front = 0;
            rear = -1;
            size = 0;
            return value;
        }

        rear = (rear - 1 + capacity) % capacity;
        size--;


        return value;
    }

    int removeFront() {
        if (isEmpty()) {
            return -1;

        }
        int value = arr[front];
        if (size == 1) {
            front = 0;
            rear = -1;
            size = 0;
            return value;
        }

        front = (front + 1) % capacity;

        size--;

        return value;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == capacity;
    }
}

public class DequeueImplementation {
    static void main(String[] args) {
        DeQueue queue = new DeQueue(5);

        queue.addFirst(1);
        queue.addLast(2);
        queue.addFirst(3);

    }
}
