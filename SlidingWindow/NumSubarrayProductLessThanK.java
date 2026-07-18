package SlidingWindow;

public class NumSubarrayProductLessThanK {
    static void main(String[] args) {
        int[] nums = {10, 5, 2, 6};
        int k = 100;
        int ans = numSubarrayProductLessThanK(nums, k);
        System.out.println(ans);
    }

    private static int numSubarrayProductLessThanK(int[] nums, int k) {
        long product = 1;
        int left = 0;
        int count = 0;
        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];


            while (product >= k) {
                product /= nums[left];
                left++;
            }

            if (product < k) {
                count += right - left + 1;
            }


        }
        return count;

    }
}
