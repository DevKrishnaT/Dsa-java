package lesson_1.questions.leetcode;

import java.util.Arrays;

public class concatination_of_array {

    public static int[] getConcatenation(int[] nums) {

        int[] arr = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
            arr[i + nums.length] = nums[i];
        }
        return arr;
    }

    ;

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 5};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

}
