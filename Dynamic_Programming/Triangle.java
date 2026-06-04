package Dynamic_Programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triangle {
    static void main(String[] args) {
        List<List<Integer>> triangle = Arrays.asList(
                Arrays.asList(2),
                Arrays.asList(3, 4),
                Arrays.asList(6, 5, 7),
                Arrays.asList(4, 1, 8, 3)
        );
        int ans = minimumTotal(triangle);
        System.out.println(ans);
    }

    private static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return calculate(triangle, n - 1, 0, 0, dp);
    }

    private static int calculate(List<List<Integer>> triangle, int n, int i, int CurrN, int[][] dp) {

        if (n == CurrN) {
            return triangle.get(CurrN).get(i);
        }
        if (dp[CurrN][i] != -1) {
            return dp[CurrN][i];
        }


        int CurrPosition = calculate(triangle, n, i, CurrN + 1, dp);
        int OnePlus = calculate(triangle, n, i + 1, CurrN + 1, dp);

        return dp[CurrN][i] = triangle.get(CurrN).get(i) + +Math.min(CurrPosition, OnePlus);
    }


}
