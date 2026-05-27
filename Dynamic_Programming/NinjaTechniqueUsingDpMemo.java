package Dynamic_Programming;

import java.util.Arrays;

public class NinjaTechniqueUsingDpMemo {
    static void main(String[] args) {
        int[][] mat = {{1, 2, 5},
                {3, 1, 1},
                {3, 3, 3}};
        int ans = MaximumPoints(mat);
        System.out.println(ans);
    }

    private static int MaximumPoints(int[][] mat) {
        int n = mat.length;
        int[][] dp = new int[n][n];
        for (int[] curr : dp) {
            Arrays.fill(curr, -1);
        }

        return solve(n - 1, mat, 3, dp);
    }

    private static int solve(int day, int[][] mat, int last, int[][] dp) {


        if (day == 0) {
            int maxi = 0;
            for (int i = 0; i < 3; i++) {
                if (i != last) {
                    maxi = Math.max(maxi, mat[day][i]);
                }
            }
            return maxi;
        }
        if (dp[day][last] != -1) {
            return dp[day][last];
        }
        int maxi = 0;

        for (int i = 0; i < 3; i++) {
            if (i != last) {
                int marit = mat[day][i] + solve(day - 1, mat, i, dp);

                maxi = Math.max(maxi, marit);
            }
        }
        return dp[day][last] = maxi;
    }

}
