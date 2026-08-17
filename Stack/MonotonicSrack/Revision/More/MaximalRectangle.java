package Stack.MonotonicSrack.Revision.More;

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
        int[] heights = new int[matrix[0].length];
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j].equals("1")) {
                    heights[j]++;
                } else {
                    heights[j] = 0;
                }
            }

            max = Math.max(max, largestRactangle(heights));

        }

        return max;

    }

    private static int largestRactangle(int[] heights) {
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                left[i] = i + 1;
            } else {
                left[i] = i - stack.peek();
            }

            stack.push(i);
        }

        stack.clear();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                right[i] = n - i;
            } else {
                right[i] = stack.peek() - i;
            }
            stack.push(i);
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            int value = heights[i] * (left[i] - 1 + right[i]);
            max = Math.max(max, value);
        }
        return max;
    }
}
