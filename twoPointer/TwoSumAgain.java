package twoPointer;

import java.util.Arrays;

public class TwoSumAgain {
    static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ans = twoSum(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int total = nums[left] + nums[right];

            if (total == target) {
                return new int[]{left + 1, right + 1};
            }

            if (total < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }

}
