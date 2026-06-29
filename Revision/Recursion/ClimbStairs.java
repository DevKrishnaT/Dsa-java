package Revision.Recursion;

import java.util.Arrays;

public class ClimbStairs {
    static void main(String[] args) {
        int n = 10;
        int ans = climbStairs(n);
        System.out.println(ans);
    }

    private static int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return climb(n, dp);


    }

    private static int climb(int n, int[] dp) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        return dp[n] = climb(n - 1, dp) + climb(n - 2, dp);
    }
}
