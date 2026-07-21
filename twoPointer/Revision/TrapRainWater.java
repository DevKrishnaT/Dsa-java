package twoPointer.Revision;

public class TrapRainWater {
    static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int ans = trap(height);
        System.out.println(ans);
    }

    private static int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxl = 0;
        int maxr = 0;
        int ans = 0;
        while (left < right) {
            if (height[left] <= height[right]) {
                int total = maxl - height[left];
                if (!(total <= 0)) {
                    ans += total;
                }

                maxl = Math.max(maxl, height[left++]);
            } else {
                int total = maxr - height[right];
                if (!(total <= 0)) {
                    ans += total;
                }
                maxr = Math.max(maxr, height[right--]);
            }
        }
        return ans;
    }
}
