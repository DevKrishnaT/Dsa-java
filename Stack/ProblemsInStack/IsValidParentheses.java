package Stack.ProblemsInStack;

import java.util.Stack;

public class IsValidParentheses {
    static void main(String[] args) {
        String s = "()[]{}";
        boolean ans = isValid(s);
        System.out.println(ans);
    }

    private static boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.add(c);
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
