package Revision.DoublyLinkedList;

class DNode {
    int val;
    DNode next;
    DNode prev;

    DNode(int val) {
        this.val = val;
        next = null;
        prev = null;
    }

}

public class Implementation {
    static void main(String[] args) {
        DNode head = new DNode(5);
        head.next = new DNode(10);
        head.next.prev = head;
        head.next.next = new DNode(10);
        head.next.next.prev = head.next;
        head = InsertAtHead(head, 1);
        print(head);
        head = deletehead(head);
        print(head);


    }

    public static DNode InsertAtHead(DNode head, int val) {
        DNode newNode = new DNode(val);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;

        }

        return newNode;
    }

    public static void print(DNode head) {
        DNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static DNode deletehead(DNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        head = head.next;
        head.prev = null;

        return head;


    }
}
