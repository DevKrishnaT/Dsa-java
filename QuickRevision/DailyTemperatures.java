package QuickRevision;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    static void main(String[] args) {
        int[] temperatures = {30, 40, 50, 60};
        int[] ans = dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                ans[stack.peek()] = i - stack.peek();
                stack.pop();
            }

            stack.push(i);

        }
        return ans;
    }
}
