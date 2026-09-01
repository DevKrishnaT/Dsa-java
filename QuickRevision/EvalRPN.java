package QuickRevision;

import java.util.Objects;
import java.util.Stack;

public class EvalRPN {
    static void main(String[] args) {
        String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        int ans = evalRPN(tokens);
        System.out.println(ans);
    }

    private static int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String s : tokens) {


            if (Objects.equals("+", s) || Objects.equals("*", s) || Objects.equals("/", s) || Objects.equals("-", s)) {
                int first = st.pop();
                int sec = st.pop();
                int third = 0;
                if (Objects.equals(s, "+")) third = first + sec;
                if (Objects.equals(s, "*")) third = first * sec;
                if (Objects.equals(s, "/")) third = sec / first;
                if (Objects.equals(s, "-")) third = sec - first;
                st.push(third);
            } else {
                st.push(Integer.parseInt(s));
            }
        }

        return st.peek();
    }
}
