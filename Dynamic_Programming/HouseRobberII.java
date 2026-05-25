package Dynamic_Programming;

import java.util.Arrays;

public class HouseRobberII {
    static void main(String[] args) {
        int[] nums = {1, 2, 1, 1};
        int ans = robb(nums);
        System.out.println(ans);
    }

    private static int robb(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];

        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        int first = colculate(0, n - 2, nums, dp1);

        int sec = colculate(1, n - 1, nums, dp2);

        return Math.max(first, sec);
    }

    private static int colculate(int i, int n, int[] nums, int[] dp) {

        if (i > n) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }
        int pick = nums[i] + colculate(i + 2, n, nums, dp);

        int notPick = colculate(i + 1, n, nums, dp);
        dp[i] = Math.max(pick, notPick);
        return dp[i];

    }


}
