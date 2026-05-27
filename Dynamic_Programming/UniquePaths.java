package Dynamic_Programming;

import java.util.Arrays;

public class UniquePaths {
    static void main(String[] args) {
        int m = 3;
        int n = 7;

        int ans = uniquePaths(m, n);
        System.out.println(ans);

    }

    private static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int[] curr : dp) {
            Arrays.fill(curr, -1);
        }
        return calculate(m, n, 0, 0, dp);
    }

    private static int calculate(int m, int n, int row, int col, int[][] dp) {

        if (row == m - 1 && col == n - 1) {
            return 1;
        }
        if (row >= m || col >= n) {
            return 0;
        }

        if (dp[row][col] != -1) {
            return dp[row][col];
        }


        int down = calculate(m, n, row + 1, col, dp);

        int right = calculate(m, n, row, col + 1, dp);

        return dp[row][col] = down + right;
    }
}
