package lesson_1.Recursion;

import java.util.HashMap;

public class Knapsack {
    static HashMap<String, Integer> memo = new HashMap<>();

    static void main(String[] args) {
        int W = 4;
        int[] val = {1, 2, 3};
        int[] wt = {4, 5, 1};
        int ans = knapsack(W, val, wt);

    }

    private static int knapsack(int W, int[] val, int[] wt) {
        return find(0, 0, W, val, wt);
    }

    private static int find(int idx, int currentWaght, int w, int[] val, int[] wt) {
        if (idx == wt.length) {
            return 0;
        }

        int exclude = find(idx + 1, currentWaght, w, val, wt);
        String key = idx +

        int include = 0;

        if (currentWaght + wt[idx] <= w) {
            include = val[idx] + find(idx + 1,
                    currentWaght + wt[idx],
                    w, val, wt);
        }
        return Math.max(include, exclude);
    }


}
