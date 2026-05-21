package Dynamic_Programming;

public class batterFibonacci {
    static void main(String[] args) {
        int n = 9;
        int ans = fib(n);
        int spaceOptimaization = fibSpaceOpt(n);
        System.out.println(ans);
    }

    private static int fibSpaceOpt(int n) {
        if (n <= 1) {
            return n;
        }
        int prev2 = 0;
        int prev = 1;
        for (int i = 2; i <= n; i++) {
            int curr = prev + prev2;
            prev2 = prev;
            prev = curr;
        }

        return prev;
    }

    private static int fib(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
