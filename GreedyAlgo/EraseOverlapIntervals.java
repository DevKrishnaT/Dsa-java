package GreedyAlgo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class EraseOverlapIntervals {
    static void main(String[] args) {
        int[][] intervals = {
                {1, 2},
                {2, 3},
                {3, 4},
                {1, 3}
        };
        int ans = eraseOverlapIntervals(intervals);
        System.out.println(ans);
    }

    private static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int remove = 0;
        int prev = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < prev) {
                remove++;
            } else {
                prev = intervals[i][1];
            }
        }

        return remove;
    }
}
