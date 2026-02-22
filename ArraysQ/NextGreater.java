package ArraysQ;

import java.util.ArrayList;
import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> Stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            list.add(-1);
        }
        for (int i = 0; i < 2 * n; i++) {
            int idx = i % n;
            int num = arr[idx];
            while (!Stack.empty() && num > arr[Stack.peek()]) {
                list.add(Stack.pop(), num);

            }
            if (i > n) {
                Stack.push(idx);
            }
        }
        System.out.println(list);
    }
}
