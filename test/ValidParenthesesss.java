package test;

import java.util.Stack;

public class ValidParenthesesss {
    static void main(String[] args) {
        String s = "(){[]}";

        boolean ans = isValid(s);
    }

    private static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.isEmpty()) return false;
                char top = st.pop();
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }
        return st.isEmpty();
    }
}
