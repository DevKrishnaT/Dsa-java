package LinkedList;


class LLR {
    Node head = null;

    class Node {
        Integer x;
        Node next;

        Node(Integer x) {
            this.x = x;
            this.next = null;
        }
    }

    public void addLast(Integer x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public void Treverse() {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        Node curentnode = head;
        while (curentnode.next != null) {
            System.out.print(curentnode.x + "-->");
            curentnode = curentnode.next;
        }
        System.out.print(curentnode.next);
        ;
    }

    public static void main(String[] args) {
        LLR list = new LLR();
        list.addLast(5);
        list.addLast(8);
        list.addLast(2);
        list.addLast(3);
        list.Treverse();
    }


}





