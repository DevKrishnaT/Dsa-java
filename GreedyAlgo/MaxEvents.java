package GreedyAlgo;

import java.util.Arrays;

public class MaxEvents {
    static void main(String[] args) {
        int[][] events = {{1, 2}, {2, 3}, {3, 4}};
        int ans = maxEvents(events);
    }

    private static int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> a[1] - b[1]);

        int count = 1;
        int lastend = events[0][1];

        for (int i = 1; i < events.length; i++) {
            if (events[i][0] >= lastend) {
                lastend = events[i][1];
                count++;
            }
        }
        return count;
    }
}
