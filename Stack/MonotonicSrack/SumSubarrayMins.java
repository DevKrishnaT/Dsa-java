package Stack.MonotonicSrack;

import java.util.Stack;

public class SumSubarrayMins {
    static void main(String[] args) {
        int[] nums = {2, 1, 5, 6, 2, 3};

        int total = sumSubarrayMins(nums);
        System.out.println(total);
    }

    private static int sumSubarrayMins(int[] nums) {
        int n = nums.length;
        long ans = 0;
        int MOD = 1_000_000_007;

        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
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
            while (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
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
            long value = ((long) nums[i] * left[i] % MOD) * right[i] % MOD;
            ans = (ans + value) % MOD;


        }


        return (int) ans;
    }


}
