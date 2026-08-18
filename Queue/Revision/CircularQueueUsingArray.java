package Queue.Revision;

class CircularQueue {
    private int[] arr;
    private int capacity;
    private int front;
    private int rear;
    private int size;

    CircularQueue(int size) {
        capacity = size;
        arr = new int[capacity];
        front = rear = this.size = 0;
    }

    void Enqueue(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow ");
            return;
        }

        arr[rear] = x;
        rear = (rear + 1) % capacity;
        size++;
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        int x = arr[front];
        front = (front + 1) % capacity;


        size--;
        return x;
    }


    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == capacity;
    }
}

public class CircularQueueUsingArray {
    static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

        queue.Enqueue(10);
        queue.Enqueue(20);
        queue.Enqueue(30);
        queue.Enqueue(40);
        queue.Enqueue(50);
        queue.Enqueue(20);
        System.out.println(queue.dequeue());
        queue.Enqueue(20);
    }
}
