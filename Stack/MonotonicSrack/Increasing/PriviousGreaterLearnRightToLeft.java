package Stack.MonotonicSrack.Increasing;

import java.util.Stack;

public class PriviousGreaterLearnRightToLeft {
    static void main(String[] args) {
        int[] arr = {2, 1, 5, 3, 4};

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            while (!st.isEmpty() && st.peek() <= num) {
                st.pop();
            }

            if (st.isEmpty()) {
                System.out.println("for " + num + " greater is " + -1);
            } else {
                System.out.println("for " + num + " greater is " + st.peek());
            }
            st.push(num);
        }
    }
}
