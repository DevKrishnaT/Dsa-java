package RecursionAgain.Basic;

import java.util.Arrays;

public class ReverseArray {
    static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        reverse(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    private static void reverse(int[] nums, int first, int last) {
        if (first > last) {
            return;
        }
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
        reverse(nums, first + 1, last - 1);
    }
}
