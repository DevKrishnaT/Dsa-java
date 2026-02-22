package Stack.MonotonicSrack;

import java.util.ArrayDeque;
import java.util.Deque;

class StockSpanner {
    private Deque<int[]> stack;

    public StockSpanner() {
        stack = new ArrayDeque<>();
    }

    public int next(int price) {
        int span = 1;
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.peek()[1];
            stack.pop();
        }

        stack.push(new int[]{price, span});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */

public class OnlineStockSpaning {
    static void main(String[] args) {
        StockSpanner sss = new StockSpanner();
        System.out.println(sss.next(10));
        System.out.println(sss.next(40));
        System.out.println(sss.next(20));
        System.out.println(sss.next(50));

    }
}
