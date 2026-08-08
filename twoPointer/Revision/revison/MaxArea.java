package twoPointer.Revision.revison;

public class MaxArea {
    static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int ans = maxArea(height);
        System.out.println(ans);
    }

    private static int maxArea(int[] height) {
        int ans = 0;

        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int length = right - left;
            int minWall = Math.min(height[left], height[right]);
            ans = Math.max(ans, length * minWall);
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return ans;
    }
}
