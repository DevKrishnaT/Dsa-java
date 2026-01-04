package lession_1.topic_group_1.collection_framework.queue.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class queuee {
    public static void main(String[] args) {
        Queue<Integer> Q1 = new LinkedList<>();
        Q1.add(10);
        Q1.add(27);
        Q1.add(28);
        Q1.add(44);

        Q1.remove();
        Q1.remove();

        Q1.poll();
        Q1.peek();
        Q1.element();

        System.out.println(Q1);
    }
}
