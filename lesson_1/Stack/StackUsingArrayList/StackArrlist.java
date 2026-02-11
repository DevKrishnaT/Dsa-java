package lesson_1.Stack.StackUsingArrayList;


import java.util.ArrayList;
import java.util.List;

class Stack {
    static List<Integer> list = new ArrayList<>();

    public static void Push(int x) {
        list.add(x);
    }

    public static void pop() {
        if (list.isEmpty()) {
            System.out.println("empty");
            return;
        }

        list.removeLast();
    }

    public static void peek() {
        if (list.isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println(list.getLast());
    }


}

public class StackArrlist {

    static void main(String[] args) {
        Stack.Push(9);
        Stack.Push(8);
        Stack.Push(2);
        Stack.Push(7);
        Stack.Push(4);
        Stack.Push(5);
        Stack.pop();
        Stack.pop();
        Stack.pop();
        Stack.pop();
        Stack.pop();
        Stack.peek();


    }


}



