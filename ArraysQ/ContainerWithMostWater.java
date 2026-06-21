package ArraysQ;

public class ContainerWithMostWater {
    static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int ans = maxArea(height);
        System.out.println(ans);
    }

    private static int maxArea(int[] height) {
        int n = height.length;
        int first = 0;
        int last = n - 1;
        int mostWater = 0;
        while (first < last) {
            int min = Math.min(height[first], height[last]);
            int distance = last - first;
            mostWater = Math.max(mostWater, min * distance);
            if (min == height[first]) {
                first++;
            } else {
                last--;
            }
        }
        return mostWater;
    }
}
