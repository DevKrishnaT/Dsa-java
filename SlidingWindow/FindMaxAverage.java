package SlidingWindow;

public class FindMaxAverage {
    static void main(String[] args) {
        int[] nums = {5};
        int k = 1;
        double ans = findMaxAverage(nums, k);
        System.out.println(ans);
    }

    private static double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double ans = Double.NEGATIVE_INFINITY;

        int left = 0;


        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (i >= k - 1) {
                ans = Math.max(ans, sum / k);

                sum -= nums[left];
                left++;
            }

        }
        return ans;
    }
}
