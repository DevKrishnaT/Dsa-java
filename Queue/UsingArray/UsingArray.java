package Queue.UsingArray;

class QueueArr {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;

    QueueArr(int size) {
        capacity = size;
        arr = new int[capacity];
        front = rear = -1;
    }

    void Enqueue(int x) {
        if (rear == capacity - 1) {
            System.out.println("overFlow");
            return;
        }

        if (front == -1) {
            front = 0;
        }
        rear++;
        arr[rear] = x;

    }

    int deQueue() {
        if (isEmpty()) {
            return -1;
        }
        int ans = arr[front++];
        if (front > rear) {
            front = rear = -1;
        }
        return ans;

    }

    boolean isEmpty() {
        return (front == -1);


    }

}

public class UsingArray {
    static void main(String[] args) {
        QueueArr q = new QueueArr(5);

        q.Enqueue(1);
        q.Enqueue(1325);
        q.Enqueue(23);
        q.Enqueue(46);
        q.Enqueue(3);
        q.Enqueue(2);
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());

    }
}
