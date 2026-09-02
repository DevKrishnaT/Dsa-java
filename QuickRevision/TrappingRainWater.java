package QuickRevision;

import java.util.Stack;

public class TrappingRainWater {
    static void main(String[] args) {
        int[] heights = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        int ans = trap(heights);
        System.out.println(ans);
    }

    private static int trap(int[] heights) {


        Stack<Integer> stack = new Stack<>();

        int ans = 0;


        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[i] > heights[stack.peek()]) {
                int bottom = stack.pop();

                if (stack.isEmpty()) {
                    break;
                }


                int width = i - stack.peek() - 1;

                int height = Math.min(heights[i], heights[stack.peek()]) - heights[bottom];

                ans += width * height;
            }
            stack.push(i);
        }

        return ans;
    }
}
