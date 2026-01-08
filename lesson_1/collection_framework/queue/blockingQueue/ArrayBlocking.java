package lesson_1.collection_framework.queue.blockingQueue;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


public class ArrayBlocking {
    public static void main(String[] args) {
        BlockingQueue<Integer> Q1 = new ArrayBlockingQueue<>(5);
        try {
            Q1.put(10);
            Q1.put(457);
            Q1.put(687);
            Q1.put(443);
            Q1.put(34);
            System.out.println(Q1);
            Thread.sleep(2000);
            Q1.remove();
            Q1.put(23490);

            System.out.println(Q1);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }
}
