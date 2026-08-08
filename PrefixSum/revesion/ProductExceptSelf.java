package PrefixSum.revesion;

import java.util.Arrays;

public class ProductExceptSelf {
    static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] ans = productExceptSelf(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, 1);

        int preffix = 1;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = preffix;
            preffix = preffix * nums[i];

        }
        int suffix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= suffix;
            suffix = suffix * nums[i];
        }

        return ans;
    }
}
