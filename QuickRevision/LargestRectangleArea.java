package QuickRevision;

import java.util.Arrays;
import java.util.Stack;

public class LargestRectangleArea {
    static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        int ans = largestRectangleArea(heights);
        System.out.println("Ans :- " + ans);
    }

    private static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] right = new int[n];
        int[] left = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
                int prev = stack.pop();
                right[prev] = i;
            }

            stack.push(i);
        }
        while (!stack.isEmpty()) {
            right[stack.pop()] = n;
        }

        stack.clear();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() &&
                    heights[stack.peek()] > heights[i]) {

                stack.pop();
            }

            if (stack.isEmpty()) {
                left[i] = -1;
            } else {
                left[i] = stack.peek();
            }

            stack.push(i);
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] - 1;

            int value = width * heights[i];

            max = Math.max(max, value);
        }
        return max;

    }
}
