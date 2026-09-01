package QuickRevision;

import java.util.Stack;

public class LargestRectangleAreaOptimal {
    static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        int ans = largestRectangleArea(heights);
        System.out.println(ans);
    }

    private static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();

        int max = 0;

        for (int i = 0; i < heights.length; i++) {

            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
                int height = heights[stack.pop()];
                int width;

                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }

                int value = width * height;
                max = Math.max(max, value);
            }

            stack.push(i);

        }

        while (!stack.isEmpty()) {
            int height = heights[stack.pop()];
            int width;

            if (stack.isEmpty()) {
                width = heights.length;
            } else {
                width = heights.length - stack.peek() - 1;
            }

            int value = width * height;
            max = Math.max(max, value);
        }

        return max;


    }
}
