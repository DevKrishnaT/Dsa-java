package Stack.MonotonicSrack.decrising;

import java.util.Arrays;
import java.util.Stack;

public class PreviousSmaller {
    static void main(String[] args) {
        int[] num = {2, 4, 1, 6};

        int[] ans = previousSmaller(num);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] previousSmaller(int[] nums) {
        int[] ans = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            while (!stack.isEmpty() && stack.peek() > num) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                ans[i] = nums[i];
            } else {
                ans[i] = stack.peek();
            }
            stack.push(num);
        }

        return ans;
    }
}
