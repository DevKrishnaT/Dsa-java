package Dynamic_Programming;

import java.util.Arrays;

public class HouseRobberIISpaceRed {
    void main(String[] args) {
        int[] nums = {1, 2, 1, 1};
        int ans = robber(nums);
        System.out.println(ans);
    }

    private int robber(int[] nums) {
        int n = nums.length;

        if (n == 1)
            return nums[0];

        int[] first =
                Arrays.copyOfRange(nums, 0, n - 1);

        int[] second =
                Arrays.copyOfRange(nums, 1, n);

        return Math.max(
                solveTab(first),
                solveTab(second)
        );
    }

    private int solveTab(int[] nums) {
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
}
