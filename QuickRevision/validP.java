package QuickRevision;

import java.util.Stack;

public class validP {
    static void main(String[] args) {
        String s = "()[]{}";
        boolean ans = isValid(s);
        System.out.println(ans);
    }

    public static boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                char top = st.pop();
                if (c == ')' && top != '(') return false;
                if (c == ']' && top != '[') return false;
                if (c == '}' && top != '{') return false;
            }
        }

        return st.isEmpty();

    }
}
