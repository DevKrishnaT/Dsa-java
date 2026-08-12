package Stack.MonotonicSrack.Revision;

import java.util.Objects;
import java.util.Stack;

public class MaximalRectangle {
    static void main(String[] args) {
        String[][] matrix = {
                {"1", "0", "1", "0", "0"},
                {"1", "0", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "0", "0", "1", "0"}
        };
        int ans = maximalRectangle(matrix);
        System.out.println(ans);
    }

    private static int maximalRectangle(String[][] matrix) {
        int[] height = new int[matrix[0].length];
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (Objects.equals(matrix[i][j], "1")) {
                    height[j]++;
                } else {
                    height[j] = 0;
                }
            }

            max = Math.max(max, largetsRactangle(height));
        }
        return max;
    }

    private static int largetsRactangle(int[] height) {
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        for (int i = 0; i <= height.length; i++) {
            int countHeight = (i == height.length) ? 0 : height[i];

            while (!st.isEmpty() && height[st.peek()] > countHeight) {

                int h = height[st.pop()];

                int width = (st.isEmpty()) ? i : i - st.peek() - 1;

                int area = h * width;

                maxArea = Math.max(maxArea, area);
            }
            if (i < height.length) {
                st.push(i);
            }
        }
        return maxArea;
    }
}
