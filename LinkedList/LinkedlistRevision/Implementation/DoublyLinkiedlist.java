package LinkedList.LinkedlistRevision.Implementation;

class DubListNode {
    int value;
    DubListNode next;
    DubListNode prev;

    DubListNode(int value) {
        this.value = value;
    }
}

public class DoublyLinkiedlist {
    static void main(String[] args) {
        DubListNode head = new DubListNode(10);

        head.next = new DubListNode(20);

        head.next.prev = head;

    }
}
