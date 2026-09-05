package Stack.ImplemnetationRev;

class StackArr {
    int[] arr;
    int capacity;
    int size;

    int rear;


    StackArr(int size) {
        capacity = size;
        arr = new int[capacity];
        this.size = 0;

        rear = -1;
    }

    void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }

        rear++;
        arr[rear] = value;
        size++;
    }

    int poll() {
        if (isEmpty()) {
            return -1;
        }

        int value = arr[rear];
        rear--;
        size--;

        return value;
    }

    int peek() {
        if (isEmpty()) {
            return -1;
        }

        return arr[rear];
    }

    boolean isEmpty() {
        return size == 0;
    }

    private boolean isFull() {
        return size == capacity;
    }


}

public class StackUsingArray {
    static void main(String[] args) {
        StackArr stack = new StackArr(5);
        stack.push(10);
        stack.push(50);
        stack.push(30);
        stack.push(20);
        stack.push(50);
    }
}
