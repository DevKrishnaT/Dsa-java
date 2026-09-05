package Queue.Implementation;

class QueueN {
    int[] arr;
    int capacity;
    int front;
    int rear;
    int size;

    QueueN(int size) {

        capacity = size;
        arr = new int[capacity];
        this.size = 0;
        front = -1;
        rear = -1;
    }

    void add(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear++;
        }

        arr[rear] = value;
        size++;


    }

    int poll() {
        if (isEmpty()) {
            return -1;
        }

        int value = arr[front];
        if (size == 1) {
            front = rear = -1;
        } else {
            front++;
        }

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

public class NormalQueue {
    static void main(String[] args) {
        QueueN queue = new QueueN(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        queue.add(9);
        System.out.println(queue.poll());
    }
}
