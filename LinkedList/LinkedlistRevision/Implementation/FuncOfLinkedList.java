package LinkedList.LinkedlistRevision.Implementation;

public class FuncOfLinkedList {
    static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head = head.insertAtStart(head, 5);
        head.treversal(head);
        head = head.DeleteNode(head, 30);

        head.treversal(head);

        ListNode reverse = head.reverse(head);

        reverse.treversal(reverse);

    }

}
