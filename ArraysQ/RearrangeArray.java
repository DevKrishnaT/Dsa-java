package ArraysQ;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArray {
    static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};
        int[] ans = rearrangeArray(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int even = 0;
        int odd = 1;
        for (int x : nums) {
            if (x < 0) {
                ans[odd] = x;
                odd += 2;
            } else {
                ans[even] = x;
                even += 2;
            }
        }
        return ans;
    }
}
