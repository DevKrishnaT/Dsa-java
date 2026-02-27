package GreedyAlgo;

public class MaxMeetings {
    static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};
        int ans = maxMeetings(start, end);
        System.out.println(ans);
    }

    private static int maxMeetings(int[] start, int[] end) {
        boolean[] check = new boolean[start.length];
        int count = 0;
        check[start.length - 1] = true;
        for (int i = 0; i < start.length - 1; i++) {
            check[i] = end[i] < start[i + 1];
        }

        for (boolean ans : check) {
            if (ans) count++;
        }
        return count;
    }
}
