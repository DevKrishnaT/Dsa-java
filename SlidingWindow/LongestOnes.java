package SlidingWindow;

public class LongestOnes {
    static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int k = 3;
        int ans = longestOnes(nums, k);
        System.out.println(ans);
    }

    private static int longestOnes(int[] nums, int k) {
        int left = 0;
        int nonZeros = 0;
        int max = 0;
        for (int right = 0; right < nums.length; right++) {

            int num = nums[right];

            if (num == 0) nonZeros++;

            if (nonZeros <= k) {
                max = Math.max(max, right - left + 1);
            }

            while (nonZeros > k) {
                int curr = nums[left];
                if (curr == 0) nonZeros--;
                left++;
            }

        }
        return max;
    }
}
