package Dynamic_Programming;

import java.util.Arrays;

public class Fibbonachi {
    static void main(String[] args) {
        int n = 3;

        int ans = fib(n);
        int ans2 = fib2(n);
        System.out.println(ans);
        System.out.println(ans2);
    }

    private static int fib2(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        for (int i = 0; i <= n; i++) {
            if (i == 0 || i == 1) {
                dp[i] = i;
                continue;
            }

            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    private static int fib(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return solve(n, dp);
    }

    private static int solve(int n, int[] dp) {
        if (n == 0 || n == 1) {
            return n;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        return dp[n] = solve(n - 1, dp) + solve(n - 2, dp);
    }


}
