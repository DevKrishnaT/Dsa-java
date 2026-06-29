package LeetcodeContest;

import java.util.Arrays;

public class maxSum {
    static void main(String[] args) {
        int[] nums = {4, 4, 4, 4};
        int k = 1;
        int mul = 1;
        long ans = maxsum(nums, k, mul);
        System.out.println(ans);
    }

    private static long maxsum(int[] nums, int k, int mul) {
        long total = 0;

        Arrays.sort(nums);
        int i = nums.length - 1;

        while (k > 0 && i >= 0) {
            if (mul > 0) {
                total += (long) nums[i] * mul;
                mul--;
            } else {
                total += nums[i];
            }

            i--;
            k--;
        }
        return total;
    }
}
