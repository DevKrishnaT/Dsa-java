package ArraysQ;

import java.util.Arrays;

public class RearageArray {
    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};
        int odd = 1;
        int even = 0;
        int[] newArr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num >= 0) {
                newArr[even] = num;
                even += 2;
            } else {
                newArr[odd] = num;
                odd += 2;
            }

        }
        System.out.println(Arrays.toString(newArr));


    }
}
