package LinkedList;

class listliked {
    Node head = null;

    class Node {
        Integer x;
        Node next;

        Node(Integer x) {
            this.x = x;
            this.next = null;

        }
    }

    public int legthOfLoop() {
        Node slow = head;
        Node fast = head;
        int count = 0;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = slow.next;

                while (slow != fast) {
                    count++;
                    slow = slow.next;
                }
                return count;
            }
        }
        return 0;
    }

}

public class LengthOfloop {
    static void main() {

    }
}
