package Queue.Revision;

import java.util.LinkedList;
import java.util.Queue;

class MyDeQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    MyDeQueue(int size) {
        capacity = size;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        this.size = 0;
    }

    boolean isFull() {
        return size == capacity;
    }

    void addLast(int x) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
    }

    void addFirst(int x) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        front = (front - 1 + capacity) % capacity;
        arr[front] = x;

        size++;

        if (size == 1) {
            rear = front;
        }

    }

    int removeFirst() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }


        int value = arr[front];

        front = (front + 1) % capacity;
        size--;

        return value;
    }

    int removeLast() {
        if (isEmpty()) {
            System.out.println("Deqeuee isEmpty");
            return -1;
        }

        int value = arr[rear];

        rear = (rear - 1 + capacity) % capacity;
        size--;

        return value;
    }

    int peekFirst() {
        if (isEmpty()) {
            return -1;
        }

        return arr[front];

    }

    int peekLast() {
        if (isEmpty()) {
            return -1;
        }

        return arr[rear];

    }

    boolean isEmpty() {
        return size == 0;
    }
}

public class DeQueue {
    static void main(String[] args) {
        MyDeQueue queue = new MyDeQueue(5);
        queue.addFirst(10);
        queue.addLast(20);
        System.out.println(queue.removeFirst());
    }

}
