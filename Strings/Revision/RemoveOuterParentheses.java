package Strings.Revision;

import java.util.Stack;

public class RemoveOuterParentheses {
    static void main(String[] args) {
        String s = "(()())(())";
        String ans = removeOuterParentheses(s);
        System.out.println(ans);
    }

    private static String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (!st.isEmpty()) {
                    ans.append('(');
                }
                st.push('(');
            } else {
                st.pop();
                if (!st.isEmpty()) {
                    ans.append(')');
                }
            }
        }

        return ans.toString();
    }
}
