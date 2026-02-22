package Recursion;

public class Knapsack {
    static Integer[][] memo;

    static void main(String[] args) {
        int W = 4;
        int[] val = {1, 2, 3};
        int[] wt = {4, 5, 1};
        int ans = knapsack(W, val, wt);

    }

    private static int knapsack(int W, int[] val, int[] wt) {
        memo = new Integer[wt.length][W + 1];
        return find(0, 0, W, wt, val);
    }

    private static int find(int idx, int currentWaght, int w, int[] val, int[] wt) {
        if (idx == wt.length) {
            return 0;
        }
        if (memo[idx][currentWaght] != null) return memo[idx][currentWaght];
        int exclude = find(idx + 1, currentWaght, w, val, wt);


        int include = 0;

        if (currentWaght + wt[idx] <= w) {
            include = val[idx] + find(idx + 1,
                    currentWaght + wt[idx],
                    w, val, wt);
        }
        memo[idx][currentWaght] = Math.max(include, exclude);
        return memo[idx][currentWaght];
    }


}
