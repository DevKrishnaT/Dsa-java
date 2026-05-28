package Dynamic_Programming;

import java.util.Arrays;

public class UniquePathsIITabularDP {
    static void main(String[] args) {
        int[][] obstacleGrid = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
//        int[][] obstacleGrid = {{0, 0}, {0, 1}};

        int ans = uniquePathsWithObstacles(obstacleGrid);
        System.out.println(ans);
    }

    private static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1) {
            return 0;
        }

        int[][] dp = new int[m][n];
        for (int[] curr : dp) {
            Arrays.fill(curr, -1);
        }
        dp[0][0] = 1;
        for (int row = 0; row < m; row++) {
            for (int cols = 0; cols < n; cols++) {
                if (row == 0 && cols == 0) {
                    continue;
                }
                if (obstacleGrid[row][cols] == 1) {
                    dp[row][cols] = 0;
                    continue;
                }
                int up = 0;

                if (row >= 1) {
                    up = dp[row - 1][cols];
                }

                int left = 0;

                if (cols >= 1) {
                    left = dp[row][cols - 1];
                }

                dp[row][cols] = up + left;
            }
        }

        return dp[m - 1][n - 1];


    }
}
