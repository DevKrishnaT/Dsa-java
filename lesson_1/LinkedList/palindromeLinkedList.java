package lesson_1.LinkedList;

class hello {
    Node head = null;

    class Node {
        Integer x;
        Node next;

        Node(Integer x) {
            this.x = x;
            this.next = null;
        }
    }


    public void add(Integer x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
    }

    public boolean isPalindrome() {
        Node curr = head;
        int num = 0;

        int rev = 0;
        int dec = 1;
        while (curr != null) {
            num = (num * 10) + curr.x;
            rev += dec * curr.x;
            dec *= 10;
            curr = curr.next;
        }
        if (num == rev) {
            return true;
        }

        return false;
    }

    public boolean isPalindromeoptimal() {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node prev = null;
        while (slow != null) {
            Node next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        Node left = head;
        Node right = prev;
        while (right != null) {
            if (left.x != right.x) return false;
            left = left.next;
            right = right.next;
        }

        return true;
    }
}


public class palindromeLinkedList {
    public static void main(String[] args) {
        hello newness = new hello();
        newness.add(4);
        newness.add(9);
        newness.add(7);
        newness.add(6);
        newness.add(5);
        newness.isPalindrome();


    }
}
