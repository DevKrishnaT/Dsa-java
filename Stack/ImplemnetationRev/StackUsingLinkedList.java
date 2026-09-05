package Stack.ImplemnetationRev;


class StackLinkedList {
    class ListNode {
        int value;
        ListNode next;

        ListNode(int value) {
            this.value = value;
        }
    }

    ListNode head;
    int size;

    StackLinkedList() {
        size = 0;
    }

    void push(int value) {
        ListNode newNode = new ListNode(value);

        newNode.next = head;
        head = newNode;
        size++;
    }

    void display() {
        ListNode curr = head;

        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
        System.out.println();
        return;
    }

    int peek() {
        if (head == null) {
            return -1;
        }

        return head.value;
    }

    int poll() {
        if (head == null) {
            return -1;

        }

        int value = head.value;
        head = head.next;
        size--;

        return value;
    }

    boolean isEmpty() {
        return head == null;
    }

    int size() {
        return size;
    }
}

public class StackUsingLinkedList {
    static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        stack.push(10);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.display();
        System.out.println(stack.peek());
        System.out.println(stack.poll());
        stack.display();

    }
}
