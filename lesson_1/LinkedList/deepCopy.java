package lesson_1.LinkedList;

import java.util.HashMap;

class NodeWithRandom {
    int val;
    NodeWithRandom next;
    NodeWithRandom random;

    public NodeWithRandom(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class deepCopy {
    public NodeWithRandom Copy(NodeWithRandom head) {
        if (head == null) return null;

        HashMap<NodeWithRandom, NodeWithRandom> map = new HashMap<>();

        NodeWithRandom curr = head;
        while (curr != null) {
            map.put(curr, new NodeWithRandom(curr.val));
            curr = curr.next;
        }


        curr = head;

        while (curr != null) {
            NodeWithRandom copy = map.get(curr);
            copy.next = map.get(curr.next);
            copy.random = map.get(curr.random);
            curr = curr.next;

        }
        return map.get(head);
    }
}
