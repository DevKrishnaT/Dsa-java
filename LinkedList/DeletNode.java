package LinkedList;

class List {
    Node head = null;

    class Node {
        Integer x;
        Node next;

        Node(Integer x) {
            this.x = x;
            this.next = null;
        }


    }

    public void Add(Integer x) {
        Node newNode = new Node(x);

        if (head == null) {
            head = newNode;
            return;
        }

        Node CorrentNode = head;

        while (CorrentNode.next != null) {
            CorrentNode = CorrentNode.next;

        }
        CorrentNode.next = newNode;
    }

    public Node deleteNode(Integer x) {
        if (head == null) {
            return null;
        }

        if (head.x == x) {
            return head.next;
        }
        Node CurrentNode = head;

        while (CurrentNode.next != null && CurrentNode.next.x != x) {
            CurrentNode = CurrentNode.next;
        }

        if (CurrentNode.next != null) {
            CurrentNode.next = CurrentNode.next.next;
        }

        return head;
    }

    public void Treverse() {
        if (head == null) {
            System.out.println("kuch dalo to");
            return;
        }

        Node currentNode = head;

        while (currentNode.next != null) {
            System.out.print(currentNode.x + " ->");
            currentNode = currentNode.next;

        }

        System.out.print(currentNode.x);
    }
}

public class DeletNode {
    public static void main(String[] args) {
        List newNode = new List();
        newNode.Add(97);
        newNode.Add(78);
        newNode.Add(89);
        newNode.Add(77);
        newNode.Add(1);
        newNode.Add(2);
        newNode.Add(4);
        newNode.Add(8);
        newNode.Add(6);
        newNode.Treverse();
        newNode.deleteNode(6);

        newNode.Treverse();
    }

}
