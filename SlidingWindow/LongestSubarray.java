package SlidingWindow;

public class LongestSubarray {
    static void main(String[] args) {
        int[] nums = {0, 1, 1, 1, 0, 1, 1, 0, 1};
        int ans = longestSubarray(nums);
        System.out.println(ans);
    }

    private static int longestSubarray(int[] nums) {
        int left = 0;
        int max = 0;
        int nonZeros = 0;

        for (int right = 0; right < nums.length; right++) {
            int num = nums[right];

            if (num == 0) {
                nonZeros++;
            }

            if (nonZeros <= 1) {
                max = Math.max(max, (right - left + 1) - 1);
            }

            while (nonZeros > 1) {
                int curr = nums[left];
                if (curr == 0) nonZeros--;
                left++;
            }
        }
        return max;
    }
}
