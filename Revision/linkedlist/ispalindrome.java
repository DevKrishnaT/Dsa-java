package Revision.linkedlist;

public class ispalindrome {
    static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
        boolean and = isPalindrome(head);
        System.out.println(and);
    }

    private static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        Node temp = head;
        int number = 0;


        while (temp != null) {
            number = number * 10;

            number += temp.val;


            temp = temp.next;

        }
        int match = number;

        int reverse = 0;

        while (number > 0) {
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
      
        return reverse == match;
    }
}
