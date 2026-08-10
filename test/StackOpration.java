package test;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

class stack {
    ArrayList<Integer> stack = new ArrayList<>();

    public void push(int value) {
        stack.add(value);
    }

    public int peek() {
        return stack.getLast();
    }

    public int pop() {

        return stack.removeLast();
    }

    ;

}

public class StackOpration {


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        stack st = new stack();
        st.push(20);
        st.push(30);
        System.out.println(st.peek());
        System.out.println(st.pop());

        String k = "Krishna";
        String l = "yellow";

        System.out.println(k.equals(l));
    }
}
