package Queue.Revision;

class Queue {
    private int[] arr;
    private int capacity;
    private int front;
    private int rear;


    Queue(int size) {
        capacity = size;
        arr = new int[capacity];
        front = rear = -1;
    }


    void Push(int x) {
        if (rear == capacity - 1) {
            System.out.println("Stack overflow Error");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear++;
        arr[rear] = x;
    }

    int pop() {
        if (isEmpty()) {
            return -1;
        }

        int ans = arr[front++];
        if (front > rear) {
            front = rear = -1;
        }

        return ans;
    }

    public boolean isEmpty() {
        return front == -1;
    }
}

public class QueueUsingArray {
    static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.Push(10);
        queue.Push(20);
        queue.Push(30);
        queue.Push(40);
        queue.Push(50);
        queue.Push(60);
        System.out.println(queue.isEmpty());
        System.out.println(queue.pop());
    }
}
