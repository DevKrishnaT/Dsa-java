package Stack.MonotonicSrack.Revision;

import java.util.Stack;

public class TrapRainWater {
    static void main(String[] args) {
        int[] nums = {4, 2, 0, 3, 2, 5};
        int ans = trap(nums);
        System.out.println(ans);
    }

    private static int trap(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {


            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                int bottom = stack.pop();

                if (stack.isEmpty()) {
                    break;
                }

                int left = stack.peek();

                int width = i - left - 1;


                int boundedHeight = Math.min(nums[i], nums[left]) - nums[bottom];


                ans += width * boundedHeight;
            }

            stack.push(i);
        }

        return ans;
    }
}
