package Queue.UsingLikedlist;

class LikedQueue {
    private Node head, tail;

    class Node {
        Integer data;
        Node next;
        Node prev;

        Node(Integer x) {
            this.data = x;
            next = prev = null;
        }
    }

    public void Enqueue(Integer x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public int Dequeue() {
        if (isEmpty()) {

            return -1;
        }

        int value = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }

        return value;


    }

    public int top() {
        if (isEmpty()) {

            return -1;
        }
        return head.data;


    }


    public boolean isEmpty() {
        return head == null;
    }
}

public class LikedListQueue {
    static void main(String[] args) {
        LikedQueue Queue = new LikedQueue();
        Queue.Enqueue(20);
        Queue.Enqueue(240);
        Queue.Enqueue(450);
        Queue.Enqueue(20);
        Queue.Enqueue(50);
        Queue.Enqueue(40);
        Queue.Dequeue();
        Queue.top();
        System.out.println(Queue.isEmpty());

    }
}
