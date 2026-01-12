package lesson_1.ArraysQ;

import java.util.Arrays;

public class NextPermutaion {
    public static void main(String[] args) {
        int[] nums = {1, 2};
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                int tmep = nums[i];
                nums[i] = nums[i - 1];
                nums[i - 1] = tmep;
                break;
            } else {
                int tmep = nums[i];
                nums[i] = nums[0];
                nums[0] = tmep;
            }


        }
        System.out.println(Arrays.toString(nums));
    }
}
