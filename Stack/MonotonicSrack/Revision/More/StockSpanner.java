package Stack.MonotonicSrack.Revision.More;

import java.util.HashMap;
import java.util.Stack;

public class StockSpanner {
    Stack<Integer> st;
    HashMap<Integer, Integer> map;

    public StockSpanner() {
        st = new Stack<>();
        map = new HashMap<>();

    }

    public int next(int price) {
        int pos = 1;
        while (!st.isEmpty() && st.peek() < price) {
            pos += map.get(st.pop());
        }

        map.put(price, pos);
        st.push(price);

        return map.get(price);
    }

    static void main(String[] args) {
        StockSpanner st = new StockSpanner();
        System.out.println(st.next(100));
        System.out.println(st.next(80));
        System.out.println(st.next(60));
        System.out.println(st.next(70));
        System.out.println(st.next(60));
        System.out.println(st.next(75));
        System.out.println(st.next(85));
    }
}
