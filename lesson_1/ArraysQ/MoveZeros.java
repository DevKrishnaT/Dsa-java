package lesson_1.ArraysQ;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {12, 1245, 0, 120, 0, 214, 132, 0, 4};
        int i = 0; // position for next non-zero

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

}
