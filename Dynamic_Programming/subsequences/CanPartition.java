package Dynamic_Programming.subsequences;

public class CanPartition {
    void main(String[] args) {
        int[] nums = {1, 5, 11, 5};
        boolean ans = canPartition(nums);
        System.out.println(ans);
    }


    private boolean canPartition(int[] nums) {
        int n = nums.length;
        int total = 0;
        for (int curr : nums) {
            total += curr;
        }

        if (total % 2 != 0) {
            return false;
        }
        int target = total / 2;

        Boolean[][] dp = new Boolean[n][total + 1];
        return solve(n - 1, target, nums, dp);
    }

    private boolean solve(int i, int target, int[] nums, Boolean[][] dp) {
        if (target == 0) {
            return true;
        }

        if (i == 0) return nums[0] == target;

        if (dp[i][target] != null) {
            return dp[i][target];
        }

        boolean notTaken = solve(i - 1, target, nums, dp);

        boolean taken = false;
        if (nums[i] <= target) {
            taken = solve(i - 1, target - nums[i], nums, dp);
        }

        return dp[i][target] = taken || notTaken;

    }


}
