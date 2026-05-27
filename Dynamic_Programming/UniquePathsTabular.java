package Dynamic_Programming;

import java.util.Arrays;

public class UniquePathsTabular {
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

        dp[0][0] = 1;

        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (row == 0 && col == 0) {
                    continue;
                }

                int up = 0;

                if (row >= 1) {
                    up = dp[row - 1][col];
                }

                int left = 0;

                if (col >= 1) {
                    left = dp[row][col - 1];
                }

                dp[row][col] = up + left;


            }
        }
        return dp[m - 1][n - 1];
    }
}
