package lesson_1.Stack.MonotonicSrack;

import java.util.Stack;

public class SumSubarray {
    static void main(String[] args) {
        int[] arr = {1, 2, 3};
        long ans = sumsubArray(arr);
        long max = sumsubArrayMax(arr);
        System.out.println(ans);
        System.out.println(max);
        long range = subArrayRanges(arr);
    }

    private static long subArrayRanges(int[] nums) {
        long min = sumsubArray(nums);
        long max = sumsubArrayMax(nums);
        long ans = max - min;
        return ans;
    }

    private static long sumsubArrayMax(int[] nums) {
        int n = nums.length;
        long ans = 0;


        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
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
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
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
            ans += (long) nums[i] * left[i] * right[i];

        }
        return ans;
    }

    private static long sumsubArray(int[] nums) {
        int n = nums.length;
        long ans = 0;


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
            ans += (long) nums[i] * left[i] * right[i];

        }
        return ans;
    }

}
