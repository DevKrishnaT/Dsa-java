package twoPointer;

public class MaxArea {
    static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int ans = maxArea(height);
        System.out.println(ans);
    }

    private static int maxArea(int[] nums) {

        int first = 0;
        int last = nums.length - 1;

        int ans = Integer.MIN_VALUE;

        while (first < last) {
            int length = last - first;

            int min = Math.min(nums[first], nums[last]);
            ans = Math.max(ans, min * length);
            if (nums[first] < nums[last]) {
                first++;
            } else {
                last--;
            }

        }

        return ans;
    }
}
