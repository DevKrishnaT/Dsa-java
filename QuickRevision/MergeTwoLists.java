package QuickRevision;

public class MergeTwoLists {
    static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);


        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode merge = mergeTwoLists(list1, list2);
    }

    private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return new ListNode(0);

    }
}
