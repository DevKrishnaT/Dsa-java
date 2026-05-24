package Dynamic_Programming;

import java.util.Arrays;

public class minCost {
    static void main(String[] args) {
        int[] heights = {20, 30, 40, 20};
        int ans = minCostClimbing(heights);
        System.out.println(ans);
    }

    static int[] DP;

    private static int minCostClimbing(int[] heights) {
        int i = heights.length;
        DP = new int[i];
        Arrays.fill(DP, -1);
//        return solveByDPMamorization(heights, i - 1);
//        return solve(heights, i - 1);

        return solveDPBytabular(heights);

    }

    private static int solveDPBytabular(int[] heights) {
        int n = heights.length;
        int[] DP = new int[n];
        DP[0] = 0;
        for (int i = 1; i < n; i++) {
            int left = DP[i - 1] + Math.abs(heights[i] - heights[i - 1]);
            int right = Integer.MAX_VALUE;
            if (i > 1) {
                right = DP[i - 2] + Math.abs(heights[i] - heights[i - 2]);
            }
            DP[i] = Math.min(left, right);


        }

        return DP[n - 1];
    }

    private static int solveByDPMamorization(int[] heights, int i) {
        if (i == 0) {
            return 0;
        }

        if (DP[i] != -1) {
            return DP[i];
        }

        int left = solve(heights, i - 1) + Math.abs(heights[i - 1] - heights[i]);

        int right = Integer.MAX_VALUE;

        if (i > 1) {
            right = solve(heights, i - 2)
                    + Math.abs(heights[i] - heights[i - 2]);
        }

        DP[i] = Math.min(left, right);

        return DP[i];

    }


    private static int solve(int[] heights, int i) {
        if (i == 0) return 0;

        int left = solve(heights, i - 1) + Math.abs(heights[i - 1] - heights[i]);

        int right = Integer.MAX_VALUE;

        if (i > 1) {
            right = solve(heights, i - 2)
                    + Math.abs(heights[i] - heights[i - 2]);
        }

        return Math.min(left, right);
    }
}
