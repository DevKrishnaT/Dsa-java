package QuickRevision;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    Queue<Integer> queue;
    int lowerRange;
    int upperRange;
    int elements = 0;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        lowerRange = t - 3000;
        upperRange = t;

        while (!queue.isEmpty() && queue.peek() < lowerRange) {
            queue.poll();
            elements--;
        }

        queue.add(upperRange);

        elements++;
        return elements;

    }


}


public class Pings {
    static void main(String[] args) {
        RecentCounter programe = new RecentCounter();

        System.out.println(programe.ping(1));
        System.out.println(programe.ping(100));
        System.out.println(programe.ping(3001));
        System.out.println(programe.ping(3002));


    }
}
