package SlidingWindowTwoPointer;

public class MaxScore {
    static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 1};
        int k = 3;
        int ans = maxScore(nums, k);
        System.out.println(ans);
    }

    private static int maxScore(int[] nums, int k) {
        int n = nums.length;
        int totalSum = 0;
        for (int i : nums) totalSum += i;
        if (k == n) return totalSum;

        int minWindow = n - k;
        int WindowSum = 0;
        for (int i = 0; i < minWindow; i++) {
            WindowSum += nums[i];
        }
        int minWindowSum = WindowSum;
        for (int i = minWindow; i < n; i++) {
            WindowSum += nums[i] - nums[i - minWindow];
            minWindowSum = Math.min(minWindowSum, WindowSum);
        }

        return totalSum - minWindowSum;

    }
}
