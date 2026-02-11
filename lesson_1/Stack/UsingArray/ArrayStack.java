package lesson_1.Stack.UsingArray;

class Stck {
    private int[] arr;
    private int top;
    private int capacity;


    Stck(int size) {
        capacity = size;
        top = -1;
        arr = new int[size];
    }


    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("stack iS filled");
            return;
        }
        arr[++top] = x;


    }

    public void pop() {
        if (top == -1) {

            System.out.println("stack is empty");
            return;
        }

        top--;
    }

    public void peek() {
        if (top == -1) {

            System.out.println("stack is empty");
            return;
        }

        System.out.println(arr[top]);
    }

    ;
}

public class ArrayStack {

    static void main(String[] args) {
        Stck Stack = new Stck(10);
        Stack.push(70);
        Stack.push(60);
        Stack.push(50);
        Stack.push(40);
        Stack.push(30);
        Stack.push(20);
        Stack.peek();
        Stack.pop();
        Stack.peek();
        Stack.pop();
        Stack.peek();
        Stack.pop();
        Stack.peek();
        Stack.pop();
        Stack.peek();
        Stack.pop();
        Stack.peek();
        Stack.pop();
       
    }
}
