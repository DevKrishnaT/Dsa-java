package test;

import java.util.Arrays;

public class ProductExceptSelf {
    static void main(String[] args) {
        int[] nums = {-1, 1, 0, -3, 3};
        int[] ans = productExceptSelf(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] productExceptSelf(int[] nums) {
        int totalProd = 1;
        for (int i : nums) {
            if (i != 0) {
                totalProd *= i;
            }

        }
        for (int i = 0; i < nums.length; i++) {

            nums[i] = totalProd / nums[i];
        }

        return nums;
    }
}
