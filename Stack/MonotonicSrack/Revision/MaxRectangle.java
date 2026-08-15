package Stack.MonotonicSrack.Revision;

import java.util.Stack;

public class MaxRectangle {
    static void main(String[] args) {
        char[][] matrix = {
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };
        int ans = maxRectangle(matrix);
        System.out.println(ans);
    }

    private static int maxRectangle(char[][] matrix) {
        int[] height = new int[matrix[0].length];
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    height[j]++;
                } else {
                    height[j] = 0;
                }


            }
            max = Math.max(max, largetsRectangle(height));

        }
        return max;

    }

    private static int largetsRectangle(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        Stack<Integer> stack = new Stack<>();
        int ans = 0;

        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[stack.peek()] > height[i]) {
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

        for (int i = height.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && height[stack.peek()] >= height[i]) {
                stack.pop();
            }


            if (stack.isEmpty()) {
                right[i] = height.length - i;
            } else {
                right[i] = stack.peek() - i;
            }

            stack.push(i);
        }

        for (int i = 0; i < height.length; i++) {
            int value = height[i] * (left[i] - 1 + right[i]);
            ans = Math.max(ans, value);
        }

        return ans;
    }
}
