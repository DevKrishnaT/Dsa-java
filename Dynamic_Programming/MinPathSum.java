package Dynamic_Programming;

import java.util.Arrays;

public class MinPathSum {
    static void main(String[] args) {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int ans = minPathSum(grid);
        System.out.println(ans);
    }

    static int minimumSum;


    private static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for (int[] curr : dp) {
            Arrays.fill(curr, -1);
        }


        return calculateMinimum(grid, m, n, 0, 0, dp);


    }

    private static int calculateMinimum(int[][] grid, int m, int n, int row, int col, int[][] dp) {

        if (row >= m || col >= n) {
            return Integer.MAX_VALUE;
        }
        if (row == m - 1 && col == n - 1) {
            return grid[row][col];
        }

        if (dp[row][col] != -1) {
            return dp[row][col];
        }

        int down = calculateMinimum(grid, m, n, row + 1, col, dp);

        int right = calculateMinimum(grid, m, n, row, col + 1, dp);

        int minPath = Math.min(down, right);
        if (minPath == Integer.MAX_VALUE) {
            return dp[row][col] = Integer.MAX_VALUE;
        }

        return dp[row][col] = grid[row][col] + minPath;
    }
}
