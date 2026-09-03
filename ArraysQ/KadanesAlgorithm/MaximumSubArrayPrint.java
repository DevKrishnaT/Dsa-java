package ArraysQ.KadanesAlgorithm;

import java.util.Arrays;

public class MaximumSubArrayPrint {
    static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] ans = find(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] find(int[] nums) {
        int max = Integer.MIN_VALUE;

        int start = 0;
        int bestStart = 0;
        int bestEnd = 0;

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (sum > max) {
                max = sum;
                bestStart = start;
                bestEnd = i;
            }

            if (sum < 0) {
                sum = 0;
                start = i + 1;
            }
        }

        return Arrays.copyOfRange(nums, bestStart, bestEnd + 1);
    }
}
