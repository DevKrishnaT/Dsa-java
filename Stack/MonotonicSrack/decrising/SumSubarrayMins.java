package Stack.MonotonicSrack.decrising;

import java.util.Arrays;
import java.util.Stack;

public class SumSubarrayMins {
    static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        int ans = sumSubarrayMins(nums);
        System.out.println(ans);
    }

    private static int sumSubarrayMins(int[] nums) {
        Stack<Integer> stack = new Stack<>();

        int MOD = 1_000_000_007;
        long ans = 0;
        int n = nums.length;

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

        for (int i = 0; i < nums.length; i++) {
            long value = ((long) nums[i] * left[i] % MOD) * right[i] % MOD;
            ans = (ans + value) % MOD;
        }

        return (int) ans;
    }
}
