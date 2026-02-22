package LinkedList;

class NodeList {
    Node head = null;

    class Node {
        Integer x;
        Node next;

        Node(Integer x) {
            this.x = x;
            this.next = null;
        }
    }

    Node reverseKGroup(Integer n) {
        Node Dummy = new Node(0);
        Dummy.next = head;
        Node groupPrev = Dummy;

        while (true) {
            Node kth = groupPrev;
            for (int i = 0; i < n; i++) {
                kth = kth.next;
                if (kth == null) {
                    return Dummy.next;
                }
            }

            Node GroupNext = kth.next;
            Node prev = GroupNext;
            Node curr = groupPrev.next;

            for (int i = 0; i < n; i++) {
                Node temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            Node temp = groupPrev.next;
            groupPrev.next = prev;
            groupPrev = temp;
        }


    }

    int Length(Node node) {

        Node curr = node;
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    Node rotateRight(int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int length = Length(head);
        k = k % length;
        if (k == 0) return head;

        Node dummy = new Node(0);
        dummy.next = head;

        int rotateTimes = length - k;

        Node curr = dummy;
        for (int i = 0; i < rotateTimes; i++) {
            curr = curr.next;
        }

        Node newHead = curr.next;
        curr.next = null;

        Node tail = newHead;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = dummy.next;

        return newHead;
    }

    void add(Integer x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = newNode;
            return;
        }

        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
    }

    void Treverse() {
        if (head == null) {
            System.out.print("put ");
            return;
        }


        Node curr = head;
        while (curr != null) {
            System.out.println(curr.x + " ->");
            curr = curr.next;
        }
    }
}

public class ReverseANodek {
    static void main(String[] args) {
        NodeList newLis = new NodeList();
        newLis.add(1);
        newLis.add(2);
        newLis.add(3);
        newLis.add(4);
        newLis.add(5);
        newLis.add(6);
        newLis.rotateRight(4);
        newLis.Treverse();

    }
}
