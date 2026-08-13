package Stack.MonotonicSrack.Revision;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElements {
    static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 3};
        int[] ans = nextGreaterElements(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans, -1);
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
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
