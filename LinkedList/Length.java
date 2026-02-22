package LinkedList;

class CountLength {
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

        Node Currentnode = head;
        while (Currentnode.next != null) {
            Currentnode = Currentnode.next;
        }
        Currentnode.next = newNode;
    }

    public int Length() {
        if (head == null) {
            return 0;
        }

        Node CurrentNode = head;
        int count = 0;

        while (CurrentNode != null) {
            CurrentNode = CurrentNode.next;
            count++;
        }
        return count;
    }

}


public class Length {
    public static void main(String[] args) {
        CountLength list = new CountLength();
        list.add(4);

        int length = list.Length();
        System.out.println(length);
    }
}
