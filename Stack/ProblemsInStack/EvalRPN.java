package Stack.ProblemsInStack;

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

        for (String c : tokens) {
            if (Objects.equals(c, "+") || Objects.equals(c, "/") || Objects.equals(c, "*") || Objects.equals(c, "-")) {
                int first = st.pop();
                int sec = st.pop();
                int third = 0;
                if (Objects.equals(c, "+")) third = first + sec;
                if (Objects.equals(c, "*")) third = first * sec;
                if (Objects.equals(c, "/")) third = sec / first;
                if (Objects.equals(c, "-")) third = sec - first;
                st.add(third);

            } else {
                st.push(Integer.parseInt(c));
            }
        }

        return st.pop();
    }
}
