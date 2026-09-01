package QuickRevision;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class cicularQueue {
    static void main(String[] args) {
        ArrayDeque<Integer> q = new ArrayDeque<>();

        q.addFirst(2);
        q.addLast(3);
        q.addFirst(4);
        q.addLast(5);
        q.addFirst(6);
        System.out.println(q.getLast());
        q.removeLast();
        System.out.println(q.getLast());
        q.removeLast();
        System.out.println(q.getLast());
        q.removeLast();
        System.out.println(q.getLast());

    }
}
