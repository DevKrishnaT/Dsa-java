package Recursion;

import java.util.ArrayList;
import java.util.Stack;

public class SortAStack {
    static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(41);
        stack.push(3);
        stack.push(32);
        stack.push(2);
        stack.push(11);
        System.out.println(stack);
        pop(stack);


    }


    private static void pop(Stack<Integer> stack) {
        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            int value = stack.pop();
            list.add(value);
        }
        list.sort((a, b) -> b - a);
        for (Integer integer : list) {
            stack.push(integer);
        }
        System.out.println(stack);

    }

    void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty()) return;

        int top = stack.pop();
        sortStack(stack);
        InsertStack(stack, top);
    }

    private void InsertStack(Stack<Integer> stack, int x) {
        if (stack.isEmpty() || stack.peek() <= x) {
            stack.push(x);
            return;
        }

        int top = stack.pop();
        InsertStack(stack, x);
        stack.push(top);
    }

}
