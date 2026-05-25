package Dynamic_Programming;

import java.util.Arrays;

public class HouseRobber {
    void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        int ans = rob(nums);
        System.out.println(ans);
    }

    int[] dp;

    private int rob(int[] nums) {
        int n = nums.length;
        dp = new int[n];
        Arrays.fill(dp, -1);
        return cal(nums, n - 1);
    }

    private int cal(int[] nums, int n) {
        if (n < 0) {
            return 0;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        if (n == 0) {
            return nums[0];
        }

        int leave = cal(nums, n - 1);

        int take = cal(nums, n - 2) + nums[n];
        dp[n] = Math.max(take, leave);

        return dp[n];
    }
}
