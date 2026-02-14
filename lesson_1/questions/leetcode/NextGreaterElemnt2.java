package lesson_1.questions.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElemnt2 {
    static void main(String[] args) {
        int[] nums = {2, 8, 3, 1, 2, 4};
        int[] ans = nextGreaterElements(nums);
        System.out.println(Arrays.toString(ans));

    }

    private static int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        for (int i = 2 * n - 1; i >= 0; i--) {
            int index = i % n;
            while (!stack.isEmpty() && stack.peek() <= nums[index]) {
                stack.pop();
            }

            if (i < n) {
                ans[index] = stack.isEmpty() ? -1 : stack.peek();
            }
            stack.push(nums[index]);

        }
        return ans;

    }
}
