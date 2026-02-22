package Stack.MonotonicSrack;

import java.util.Stack;

public class LargestRectangleArea {
    static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        int ans = largestRectangleArea(heights);
        System.out.println(ans);
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
