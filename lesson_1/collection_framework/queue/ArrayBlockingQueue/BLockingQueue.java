package lesson_1.collection_framework.queue.ArrayBlockingQueue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class BLockingQueue {
    public static void main(String[] args) {
        Queue<Integer> q1 = new ArrayBlockingQueue<>(4);

        q1.add(10);
        q1.add(38);
        q1.add(28);
        q1.offer(37);
        System.out.println(q1.offer(37));
        System.out.println(q1.offer(37));


    }
}
