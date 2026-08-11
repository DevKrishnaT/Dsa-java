package Stack.MonotonicSrack.decrising;

import java.util.Stack;

public class FinalPrices {
    static void main(String[] args) {
        int[] prices = {8, 4, 6, 2, 3};
        int[] ans = finalPrices(prices);
    }

    private static int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();

        for (int i = prices.length - 1; i >= 0; i--) {
            int num = prices[i];
            while (!stack.isEmpty() && stack.peek() >= num) {
                stack.pop();
            }


        }
    }
}
