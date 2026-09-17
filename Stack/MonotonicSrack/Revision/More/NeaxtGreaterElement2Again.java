package Stack.MonotonicSrack.Revision.More;

import java.util.Arrays;
import java.util.Stack;

public class NeaxtGreaterElement2Again {
    static void main(String[] args) {
        int[] nums = {2, 8, 3, 1, 2, 4};
        int[] ans = Solve(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] Solve(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        Arrays.fill(ans, -1);
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n * 2; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % n]) {
                int prev = stack.pop();
                ans[prev] = nums[i % n];
            }

            if (i < n) {
                stack.push(i);
            }
            ;
        }

        return ans;
    }
}
