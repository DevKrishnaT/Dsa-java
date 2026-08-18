package Stack.MonotonicSrack.Revision.More;

import java.util.Stack;

public class SumSubarrayMins {
    static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int ans = sumSubarrayMins(arr);
        System.out.println(ans);
    }

    private static int sumSubarrayMins(int[] arr) {
        int MOD = 1_000_000_007;
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
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
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                right[i] = n - i;
            } else {
                right[i] = stack.peek() - i;
            }

            stack.push(i);
        }


        long ans = 0;
        for (int i = 0; i < n; i++) {
            long value = ((long) left[i] * arr[i] % MOD) * right[i] % MOD;
            ans = (ans + value) % MOD;
        }

        return (int) ans;
    }
}
