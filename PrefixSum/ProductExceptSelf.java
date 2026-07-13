package PrefixSum;

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

        int prefix = 1;
        for (int i = 0; i < n; i++) {
            ans[i] = prefix;
            prefix = prefix * nums[i];
        }

        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= suffix;
            suffix *= nums[i];
        }
        return ans;
    }
}
