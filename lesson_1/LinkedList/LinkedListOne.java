package lesson_1.LinkedList;


class LL {
    Node head;

    class Node {
        Integer data;
        Node next;

        Node(Integer data) {
            this.data = data;
            this.next = null;

        }


    }

    public void addfirst(Integer data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(Integer data) {
        Node newNode = new Node(data);
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

    public void AddAtNth(Integer x, Integer n) {
        Node newNode = new Node(x);

        if (n == 0) {
            newNode.next = head.next;
            head = newNode;
            return;
        }
        Node current = head;


        for (int i = 0; i < n - 1; i++) {
            if (current == null) {
                return;
            }
            current = current.next;

        }

        newNode.next = current.next;
        current.next = newNode;
    }


    public void Treverse() {
        if (head == null) {
            System.out.println("linked list is empty");
        }
        Node currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.data + "-->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addfirst(2);
        list.addLast(3);
        list.addfirst(5);
        list.Treverse();
        list.AddAtNth(38, 2);
        list.Treverse();
    }

}





