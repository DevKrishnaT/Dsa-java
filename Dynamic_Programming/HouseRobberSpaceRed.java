package Dynamic_Programming;

import java.util.Arrays;

public class HouseRobberSpaceRed {
    static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        int ans = robber(nums);
        int ans2 = robberSpacered(nums);
        System.out.println(ans2);
    }

    private static int robberSpacered(int[] nums) {
        int n = nums.length;
        int prev = nums[0];
        int prev2 = 0;
        for (int i = 1; i < n; i++) {
            int leave = prev;

            int take = nums[i];
            if (i > 1) {
                take += prev2;
            }

            int curr = Math.max(leave, take);
            prev2 = prev;
            prev = curr;

        }

        return prev;
    }

    private static int robber(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        dp[0] = nums[0];
        for (int i = 1; i < n; i++) {
            int leave = dp[i - 1];
            int take = nums[i];
            if (i > 1) {
                take += dp[i - 2];
            }
            dp[i] = Math.max(take, leave);
        }
        return dp[n - 1];
    }
}
