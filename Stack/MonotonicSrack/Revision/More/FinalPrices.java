package Stack.MonotonicSrack.Revision.More;

import java.util.Arrays;
import java.util.Stack;

public class FinalPrices {
    static void main(String[] args) {
        int[] prices = {8, 4, 6, 2, 3};
        int[] ans = finalPrices(prices);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                int prev = stack.pop();
                ans[prev] = prices[prev] - prices[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int curr = stack.pop();
            ans[curr] = prices[curr];
        }
        return ans;
    }
}
