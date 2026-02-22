package SlidingWindowTwoPointer;

public class NumberOfSubarrays {
    static void main(String[] args) {
        int[] nums = {2, 2, 2, 1, 2, 2, 1, 2, 2, 2};
        int k = 2;
        int ans = numberOfSubarrays(nums, k);
        System.out.println(ans);
    }

    private static int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private static int atMost(int[] nums, int k) {
        if (k <= 0) return 0;
        int left = 0;
        int countOfOdd = 0;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] % 2 != 0) {
                countOfOdd++;
            }
            while (countOfOdd > k) {
                if (nums[left] % 2 != 0) {
                    countOfOdd--;
                }
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}
