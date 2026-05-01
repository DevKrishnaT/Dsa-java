package ArraysQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Interval {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {2, 6}, {8, 10}, {15, 18}};
        int[][] result = intervalArray(arr);
        for (int[] i : result) {
            System.out.println(Arrays.toString(i));
        }

    }

    public static int[][] intervalArray(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> list = new ArrayList<>();
        int[] current = intervals[0];
        list.add(current);

        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];

            if (next[0] <= current[1]) {
                current[1] = Math.max(current[1], next[1]);
            } else {
                current = next;
                list.add(current);
            }

        }


        return list.toArray(new int[list.size()][]);
    }
}
