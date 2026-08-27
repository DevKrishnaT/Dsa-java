package test;

public class MaxSubArray {
    static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int ans = maxSubArray(nums);
        System.out.println(ans);
    }

    private static int maxSubArray(int[] nums) {
        int Max = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            Max = Math.max(Max, sum);
            sum = Math.max(sum, 0);
        }
        return Max;
    }
}
