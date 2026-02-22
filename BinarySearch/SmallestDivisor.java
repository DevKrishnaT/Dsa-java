package BinarySearch;

public class SmallestDivisor {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 9};
        int threshold = 6;
        int ans = smallestDivisor(nums, threshold);
        System.out.println(ans);
    }

    private static int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int max = maxNum(nums);
        int right = max;
        int res = Integer.MAX_VALUE;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            int total = 0;
            for (int i = 0; i < nums.length; i++) {
                total += Math.ceil((double) nums[i] / mid);

            }

            if (total > threshold) {
                left = mid + 1;
            } else if (total <= threshold) {
                res = Math.min(res, mid);
                right = mid - 1;

            }


        }
        return res;
    }

    private static int maxNum(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        return max;
    }
}
