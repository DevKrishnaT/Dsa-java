package Stack.ProblemsInStack;

import java.util.Stack;

public class ScoreOfParentheses {
    static void main(String[] args) {
        String s = "((()))(())()";
        int ans = scoreOfParentheses(s);
        System.out.println(ans);
    }

    public static int scoreOfParentheses(String s) {

        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (char curr : s.toCharArray()) {
            if (curr == '(') {
                st.push(0);
            } else {
                int x = st.pop();
                int score = (x == 0) ? 1 : x * 2;
                st.push(st.pop() + score);
            }
        }
        return st.pop();
    }


}
