package Stack.MonotonicSrack.Revision.More;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElements2 {
    static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 3};
        int[] ans = nextGreaterElements(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[nums.length];
        Arrays.fill(ans, -1);
        int n = nums.length;
        for (int i = 0; i < 2 * n - 1; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % n]) {
                int prev = stack.pop();
                ans[prev] = nums[i % n];
            }
            if (i < n) {
                stack.push(i);
            }
        }


        return ans;
    }
}
