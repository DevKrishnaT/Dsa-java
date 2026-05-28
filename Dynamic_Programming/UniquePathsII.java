package Dynamic_Programming;

import java.util.Arrays;

public class UniquePathsII {
    static void main(String[] args) {
        int[][] obstacleGrid = {{0, 0, 0}, {0, 0, 0}, {0, 0, 1}};
//        int[][] obstacleGrid = {{0, 0}, {0, 1}};

        int ans = uniquePathsWithObstacles(obstacleGrid);
        System.out.println(ans);
    }

    private static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for (int[] curr : dp) {
            Arrays.fill(curr, -1);
        }
        return solve(obstacleGrid, m, n, 0, 0, dp);
    }

    private static int solve(int[][] obstacleGrid, int m, int n, int row, int cols, int[][] dp) {
        if (m <= row || n <= cols) {
            return 0;
        }

        if (obstacleGrid[row][cols] == 1) {
            return 0;
        }

        if (m - 1 == row && n - 1 == cols) {
            return 1;
        }


        if (dp[row][cols] != -1) {
            return dp[row][cols];
        }

        int left = solve(obstacleGrid, m, n, row + 1, cols, dp);
        int right = solve(obstacleGrid, m, n, row, cols + 1, dp);

        return dp[row][cols] = left + right;
    }
}
