package lesson_1.Stack.UsingLikedList;

class LinkedStack {
    private ListNode head = null;

    private class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public void push(int x) {
        ListNode newNode = new ListNode(x);
        newNode.next = head;
        head = newNode;
    }


    public void pop() {
        if (head == null) {
            System.out.println("Stack is Empty");
            return;
        }
        head = head.next;
    }


    public void peek() {
        if (head == null) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println(head.data);
    }

    public boolean isEmpty() {
        return head == null;
    }
}


public class LikedListStack {
    static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        stack.push(13460);
        stack.push(346);
        stack.push(140);
        stack.push(10);
        stack.push(20);
        stack.push(50);
        stack.push(30);
        stack.peek();
        stack.pop();
        stack.peek();
        stack.pop();
        stack.peek();
        stack.pop();
        stack.peek();
        stack.pop();
        stack.peek();
        stack.pop();
        stack.peek();
        stack.pop();
        stack.peek();
        stack.pop();
        stack.peek();
        stack.pop();
    }

}
