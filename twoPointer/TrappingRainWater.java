package twoPointer;

public class TrappingRainWater {
    static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int ans = trap(height);
        System.out.println(ans);
    }

    private static int trap(int[] nums) {
        int left = 0;

        int right = nums.length - 1;
        int maxl = 0;
        int maxr = 0;
        int total = 0;

        while (left < right) {
            if (nums[left] <= nums[right]) {
                int ans = maxl - nums[left];
                if (!(ans <= 0)) {
                    total += ans;
                }
                maxl = Math.max(maxl, nums[left++]);
            } else {
                int ans = maxr - nums[right];
                if (!(ans <= 0)) {
                    total += ans;
                }
                maxr = Math.max(maxr, nums[right--]);

            }
        }
        return total;

    }
}
