package Stack.MonotonicSrack.Increasing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class DailyTemperatures {
    static void main(String[] args) {
        int[] temp = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] ans = dailyTemperatures(temp);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] dailyTemperatures(int[] temp) {
        int[] ans = new int[temp.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = temp.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && temp[stack.peek()] <= temp[i]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                ans[i] = stack.peek() - i;
            }

            stack.push(i);

        }

        return ans;


    }
}
