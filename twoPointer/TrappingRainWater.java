package twoPointer;

public class TrappingRainWater {
    static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int ans = trap(height);
    }

    private static int trap(int[] nums) {
        int left = 0;

        while (left < nums.length) {
            if (nums[left] == 0) {
                left++;
            }
            int BrickBt = 0;
            int totalSum = 0;
            int right = left + 1;
            while (right < nums.length && nums[left] > nums[right]) {
                BrickBt += nums[right];
            }

        }
        return 0;

    }
}
