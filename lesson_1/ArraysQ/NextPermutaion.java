package lesson_1.ArraysQ;

import java.util.Arrays;

public class NextPermutaion {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        for (int i = nums.length - 1; i >= 1; i--) {
            if (nums[i] > nums[i - 1]) {
                int temp = nums[i];
                nums[i] = nums[i - 1];
                nums[i - 1] = temp;
                break;
            } else if (i == 1) {
                int temp = nums[i - 1];
                nums[i - 1] = nums[nums.length - 1];
                nums[nums.length - 1] = temp;
            } else {
                continue;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
