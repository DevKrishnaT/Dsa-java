package Stack.MonotonicSrack;

import java.util.Stack;

public class SubArrayRanges {
    static void main(String[] args) {
        int[] nums = {1, 2, 3};
        long ans = subArrayRanges(nums);
        System.out.println(ans);
    }

    private static long subArrayRanges(int[] nums) {
        long max = subArraymax(nums);
        long min = subArraymin(nums);

        return max - min;


    }

    private static long subArraymin(int[] nums) {
        Stack<Integer> stack = new Stack<>();


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
            ans += (long) nums[i] * left[i] * right[i];
        }

        return ans;
    }

    private static long subArraymax(int[] nums) {
        Stack<Integer> stack = new Stack<>();


        long ans = 0;
        int n = nums.length;

        int[] left = new int[n];
        int[] right = new int[n];

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            while (!stack.isEmpty() && nums[stack.peek()] < num) {
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
            while (!stack.isEmpty() && nums[stack.peek()] <= num) {
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
            ans += (long) nums[i] * left[i] * right[i];
        }

        return ans;
    }
}
