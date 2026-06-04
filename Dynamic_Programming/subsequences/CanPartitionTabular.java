package Dynamic_Programming.subsequences;

public class CanPartitionTabular {
    static void main(String[] args) {
        int[] nums = {1, 5, 11, 5};
        boolean ans = canPartition(nums);
        boolean ans2 = space(nums);
        System.out.println(ans);
    }

    private static boolean space(int[] nums) {
        int total = 0;

        for (int num : nums) {
            total += num;
        }

        if (total % 2 != 0) {
            return false;
        }

        int target = total / 2;

        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for (int num : nums) {
            for (int t = target; t >= num; t--) {
                dp[t] = dp[t] || dp[t - num];
            }
        }

        return dp[target];
    }

    private static boolean canPartition(int[] nums) {
        int n = nums.length;
        int total = 0;
        for (int curr : nums) {
            total += curr;
        }

        if (total % 2 != 0) {
            return false;
        }
        int target = total / 2;

        boolean[][] dp = new boolean[n][target + 1];
        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }

        if (nums[0] <= target) {
            dp[0][nums[0]] = true;
        }

        for (int i = 1; i < n; i++) {
            for (int t = 1; t <= target; t++) {
                boolean notTake = dp[i - 1][t];

                boolean take = false;
                if (nums[i] <= t) {
                    take = dp[i - 1][t - nums[i]];
                }

                dp[i][t] = take || notTake;
            }

        }
        return dp[n - 1][target];
    }


}
