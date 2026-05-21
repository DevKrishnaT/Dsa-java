package Dynamic_Programming;

import java.util.Arrays;

public class fibonachi {
    static void main(String[] args) {
        int n = 9;
        int ans = fib(n);
        System.out.println(ans);
    }

    static int[] dp;

    private static int fib(int n) {
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return findFib(n);
    }

    private static int findFib(int n) {
        if (n <= 1) {
            return n;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        return dp[n] = findFib(n - 1) + fib(n - 2);
    }
}
