package LinkedList;

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
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        for (int i = 0; i < n - 1; i++) {
            if (current == null) return;
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    public Node Deletmiddle() {
        if (head == null || head.next == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;
        Node prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;
    }

    public int addOneHelper(Node node) {
        if (node == null) {
            return 1;
        }
        int carry = addOneHelper(node.next);
        int sum = node.data + carry;
        node.data = sum % 10;
        return sum / 10;
    }

    public void addOne() {
        int carry = addOneHelper(head);
        if (carry > 0) {
            Node newNode = new Node(carry);
            newNode.next = head;
            head = newNode;
        }
    }

    public void Treverse() {
        if (head == null) {
            System.out.println("linked list is empty");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "-->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public Node removeNthFromEnd(Integer N) {
        if (head == null) return head;
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        if (N > count) return head;
        if (N == count) {
            head = head.next;
            return head;
        }
        Node curr = head;
        for (int i = 0; i < count - N - 1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }

    public Node sortlist(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = getMiddleOfList(head);
        Node rightSide = mid.next;
        mid.next = null;
        Node left = sortlist(head);
        Node right = sortlist(rightSide);
        return merge(left, right);
    }

    public Node merge(Node left, Node right) {
        Node dummy = new Node(0);
        Node curr = dummy;
        while (left != null && right != null) {
            if (left.data <= right.data) {
                curr.next = left;
                left = left.next;
            } else {
                curr.next = right;
                right = right.next;
            }
            curr = curr.next;
        }
        curr.next = (left != null) ? left : right;
        return dummy.next;
    }

    public Node getMiddleOfList(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addLast(4);
        list.addLast(2);
        list.addLast(1);
        list.addLast(3);
        list.head = list.sortlist(list.head);
        list.Treverse();
    }
}
