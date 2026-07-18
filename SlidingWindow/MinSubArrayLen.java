package SlidingWindow;

public class MinSubArrayLen {
    static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 11;
        int ans = minSubArrayLen(nums, target);
        System.out.println(ans);

    }

    private static int minSubArrayLen(int[] nums, int target) {
        int left = 0;
        int length = Integer.MAX_VALUE;
        int sum = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];


            while (sum >= target) {
                length = Math.min(length, right - left + 1);
                sum -= nums[left];
                left++;
            }


        }
        return length == Integer.MAX_VALUE ? 0 : length;
    }
}
