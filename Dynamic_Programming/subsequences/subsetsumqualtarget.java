package Dynamic_Programming.subsequences;

import java.util.Arrays;

public class subsetsumqualtarget {
    static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        boolean ans = isSubsetSum(arr, sum);
        System.out.println(ans);
    }

    private static boolean isSubsetSum(int[] arr, int target) {
        int n = arr.length;
        Boolean[][] dp = new Boolean[n][target + 1];

        return solve(n - 1, arr, target, dp);
    }

    private static boolean solve(int i, int[] arr, int target, Boolean[][] dp) {
        if (target == 0) return true;
        if (i == 0) {
            return arr[i] == target;
        }

        if (dp[i][target] != null) {
            return dp[i][target];
        }
        boolean leave = solve(i - 1, arr, target, dp);

        boolean take = false;
        if (target >= arr[i]) {
            take = solve(i - 1, arr, target - arr[i], dp);
        }


        return dp[i][target] = leave || take;
    }
}
