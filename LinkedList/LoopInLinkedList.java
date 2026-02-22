package LinkedList;

class lis {
    ListNode head = null;


    class ListNode {
        Integer x;
        ListNode next;

        ListNode(Integer x) {
            this.x = x;
            this.next = null;
        }

    }

    public boolean hasCycle() {
        if (head.next == null || head == null) {
            ;
            return false;
        }

        ListNode curr = head;


        while (curr != null && curr.x != -100001) {
            curr.x = -100001;
            curr = curr.next;
        }
        if (curr == null) {
            return false;
        } else {
            return true;
        }

    }

    public boolean hasCycleidx() {
        if (head.next == null || head == null) {
            ;
            return false;
        }

        ListNode curr = head;

        int value = -100001;
        while (curr != null && curr.x < -100001) {
            curr.x = value--;
            curr = curr.next;
        }
        if (curr == null) {
            return false;
        } else {
            return true;
        }

    }

    public void add(Integer x) {
        ListNode newNode = new ListNode(x);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
    }

    ;
}

public class LoopInLinkedList {
    public static void main(String[] args) {
        lis ll = new lis();
        ll.add(3);
        ll.add(8);
        ll.add(7);
        ll.add(45);
        ll.add(6);
        ll.add(4);
        ll.hasCycle();

    }
}
