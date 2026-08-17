package Stack.MonotonicSrack.Revision.More;

import java.util.Stack;

public class LargestRectangleArea {
    static void main(String[] args) {
        int[] height = {2, 1, 5, 6, 2, 3};
        int ans = largestRectangleArea(height);
        System.out.println(ans);
    }

    private static int largestRectangleArea(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];

        for (int i = 0; i < n; i++) {
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

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && height[stack.peek()] >= height[i]) {
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
            int curr = height[i] * (left[i] - 1 + right[i]);
            max = Math.max(max, curr);
        }

        return max;
    }
}
