package Dynamic_Programming;

import java.util.Arrays;

public class Practice {
    void main(String[] args) {
        int[] heights = {20, 30, 40, 20};
        int ans = min(heights);
        System.out.println(ans);
        int ans2 = calfast(heights);
        System.out.println(ans);
    }

    private int calfast(int[] heights) {
        int n = heights.length;


        int prev = 0;   // dp[i-1]
        int prev2 = 0;
        for (int i = 1; i < n; i++) {
            int left = prev + Math.abs(heights[i - 1] - heights[i]);
            int right = Integer.MAX_VALUE;

            if (i > 1) {
                right = prev2 + Math.abs(heights[i - 2] - heights[i]);
            }

            int curr = Math.min(left, right);

            prev2 = prev;
            prev = curr;

        }

        return prev;

    }

    int[] dp;

    private int min(int[] heights) {
        int n = heights.length;
        dp = new int[n];
        Arrays.fill(dp, -1);
        return calculate(n - 1, heights);

    }

    private int calculate(int n, int[] heights) {
        if (n == 0) return 0;

        if (dp[n] != -1) {
            return dp[n];
        }

        int left = calculate(n - 1, heights) + Math.abs(heights[n - 1] - heights[n]);
        int right = Integer.MAX_VALUE;

        if (n > 1) {
            right = calculate(n - 2, heights) + Math.abs(heights[n - 2] - heights[n]);
        }

        dp[n] = Math.min(left, right);

        return dp[n];
    }
}
