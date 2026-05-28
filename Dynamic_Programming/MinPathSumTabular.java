package Dynamic_Programming;

import java.util.Arrays;

public class MinPathSumTabular {
    static void main(String[] args) {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int ans = minPathSum(grid);
        System.out.println(ans);
    }

    private static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for (int[] curr : dp) {
            Arrays.fill(curr, -1);
        }

        dp[0][0] = grid[0][0];
        for (int row = 0; row < m; row++) {
            for (int cols = 0; cols < n; cols++) {
                if (row == m - 1 && cols == n - 1) {
                    continue;
                }
                int up = Integer.MAX_VALUE;
                int left = Integer.MAX_VALUE;


                if (row > 0) {
                    up = dp[row - 1][cols];
                }


                if (cols > 0) {
                    left = dp[row][cols - 1];
                }

                dp[row][cols] = grid[row][cols] + Math.min(up, left);
            }
        }
        return dp[m - 1][n - 1];
    }
}
