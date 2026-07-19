package twoPointer;

import java.util.Arrays;

public class SquaresofSortedArray {
    static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] ans = sortedSquares(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;
        int idx = nums.length - 1;

        while (left <= right) {
            int leftsq = nums[left] * nums[left];
            int rightsq = nums[right] * nums[right];

            if (leftsq > rightsq) {
                ans[idx] = leftsq;
                left++;
            } else {
                ans[idx] = rightsq;
                right--;
            }
            idx--;
            ;
        }
        return ans;
    }
}
