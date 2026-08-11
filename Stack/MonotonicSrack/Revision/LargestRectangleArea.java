package Stack.MonotonicSrack.Revision;

import java.util.Stack;

public class LargestRectangleArea {
    static void main(String[] args) {
        int[] height = {2, 1, 5, 6, 2, 3};
        int ans = largestRectangleArea(height);
        System.out.println(ans);
    }

    private static int largestRectangleArea(int[] nums) {

        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int ans = Integer.MIN_VALUE;
        int[] left = new int[n];
        int[] right = new int[n];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            while (!stack.isEmpty() && nums[stack.peek()] > num) {
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
            int num = nums[i];
            while (!stack.isEmpty() && nums[stack.peek()] >= num) {
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
            int curr = nums[i] * (left[i] - 1 + right[i]);
            ans = Math.max(ans, curr);
        }

        return ans;

    }
}
