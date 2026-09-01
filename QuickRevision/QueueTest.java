package QuickRevision;

class MyCircularQueue {
    int[] arr;
    int size;
    int capacity;
    int front;
    int rear;

    public MyCircularQueue(int k) {
        capacity = k;
        arr = new int[k];
        size = rear = front = 0;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }

        arr[rear] = value;
        rear = (rear + 1) % capacity;
        size++;

        return true;


    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }

        front = (front + 1) % capacity;
        size--;

        return true;

    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }

        return arr[front];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }

        return arr[(rear - 1 + capacity) % capacity];

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}


public class QueueTest {
    static void main(String[] args) {
        MyCircularQueue queue = new MyCircularQueue(5);
    }
}
