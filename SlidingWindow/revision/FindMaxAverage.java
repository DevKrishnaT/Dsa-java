package SlidingWindow.revision;

public class FindMaxAverage {
    static void main(String[] args) {
        int[] arr = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double ans = findMaxAverage(arr, k);
        System.out.println(ans);
    }

    private static double findMaxAverage(int[] nums, int k) {
        int left = 0;
        double sum = 0;
        double max = Double.NEGATIVE_INFINITY;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            if (right >= k - 1) {
                max = Math.max(max, sum / k);

                sum -= nums[left];
                left++;

            }
        }
        return max;
    }
}
