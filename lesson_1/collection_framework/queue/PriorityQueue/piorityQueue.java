package lesson_1.collection_framework.queue.PriorityQueue;

import java.util.PriorityQueue;

public class piorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(23);
        pq.add(67);
        pq.add(34);

        System.out.println(pq);
    }
}
