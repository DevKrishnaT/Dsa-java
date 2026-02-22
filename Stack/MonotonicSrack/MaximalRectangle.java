package Stack.MonotonicSrack;

import java.util.Stack;

public class MaximalRectangle {
    static void main(String[] args) {
        char[][] matrix = {
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };
        int ans = maximalRectangle(matrix);
        System.out.println(ans);
    }

    private static int maximalRectangle(char[][] matrix) {
        int ans = Integer.MIN_VALUE;
        int[][] mat = prefixSumOfMat(matrix);
        for (int[] ints : mat) {
            ans = Math.max(ans, largestRectangleArea(ints));
        }
        return ans;
    }

    private static int[][] prefixSumOfMat(char[][] matrix) {
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        int[][] mat = new int[rowLength][colLength];
        for (int row = 0; row < rowLength; row++) {
            for (int col = 0; col < colLength; col++) {
                mat[row][col] = matrix[row][col] - '0';
            }
        }
        for (int row = 1; row < rowLength; row++) {
            for (int col = 0; col < colLength; col++) {
                if (matrix[row][col] == '1') {
                    mat[row][col] = mat[row - 1][col] + 1;
                } else {
                    mat[row][col] = 0;
                }
            }
        }

        return mat;

    }

    private static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int ans = Integer.MIN_VALUE;
        int[] left = new int[n];
        int[] right = new int[n];


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

        for (int i = 0; i < n; i++) {
            int curr = heights[i] * (left[i] - 1 + right[i]);
            ans = Math.max(ans, curr);

        }
        return ans;
    }
}
