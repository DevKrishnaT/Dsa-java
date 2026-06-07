package Graph;

import java.util.Arrays;

public class maxFrequency {
    static void main(String[] args) {
        int[] nums = {1, 2, 4};
        int k = 5;
        int ans = max(nums, k);
        System.out.println(ans);
    }

    private static int max(int[] nums, int k) {
        Arrays.sort(nums);
        int max = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            int temp = k;
            for (int j = i - 1; j >= 0; j--) {

                int needed = nums[i] - nums[j];

                if (temp < needed) {
                    break;
                }

                temp -= needed;

                max = Math.max(max, i - j + 1);


            }

        }
        return max;
    }
}
