package Queue.UsingStack;


import java.util.Stack;

class StackQueue {
    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    void Enquue(int x) {
        stack.push(x);
    }

    int pop() {
        if (empty()) {
            return -1;
        }

        if (stack2.isEmpty()) {
            while (!stack.isEmpty()) {
                stack2.push(stack.pop());
            }
        }
        return stack2.pop();
    }

    int peek() {
        if (stack2.isEmpty()) {
            while (!stack.isEmpty()) {
                stack2.push(stack.pop());
            }
        }
        return stack2.peek();
    }

    public boolean empty() {
        return (stack.isEmpty() && stack2.isEmpty());
    }

}

public class UsingStack {
}
