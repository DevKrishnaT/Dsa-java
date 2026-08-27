package test;

import java.util.Arrays;

public class MoveZeroes {
    static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeros(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void moveZeros(int[] nums) {
        int placeHere = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[placeHere] = num;
                placeHere++;
            }
        }

        while (placeHere < nums.length) {
            nums[placeHere++] = 0;
        }
    }
}
