package Revision.linkedlist;

public class addtwonumbers {
    static void main(String[] args) {
        Node l1 = new Node(2);
        l1.next = new Node(4);
        l1.next.next = new Node(3);
        Node l2 = new Node(5);
        l2.next = new Node(6);
        l2.next.next = new Node(4);
        Node l3 = addTwoNumbers(l1, l2);
        print(l3);

    }

    private static void print(Node l3) {
        while (l3 != null) {
            System.out.print(l3.val + " -> ");
            l3 = l3.next;
        }
        System.out.print("null");
    }

    private static Node addTwoNumbers(Node l1, Node l2) {
        Node dummyNode = new Node(-1);
        Node curr = dummyNode;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) sum += l1.val;
            if (l2 != null) sum += l2.val;

            Node newNode = new Node(sum % 10);

            carry = sum / 10;

            curr.next = newNode;
            curr = curr.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry > 0) {
            curr.next = new Node(carry);
        }

        return dummyNode.next;
    }


}
