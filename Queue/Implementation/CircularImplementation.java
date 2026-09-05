package Queue.Implementation;

class CirQueue {
    int[] arr;
    int capacity;
    int front;
    int rear;
    int size;

    CirQueue(int size) {
        capacity = size;
        arr = new int[capacity];
        this.size = 0;
        front = 0;
        rear = 0;

    }


    void add(int value) {
        if (isFull()) {
            System.out.println("size is full");
            return;
        }


        arr[rear] = value;
        rear = (rear + 1) % capacity;
        size++;

    }

    int remove() {
        if (isEmpty()) {
            return -1;
        }


        int value = arr[front];

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

public class CircularImplementation {
    static void main(String[] args) {

    }
}
