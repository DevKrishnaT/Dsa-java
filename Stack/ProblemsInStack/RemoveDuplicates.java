package Stack.ProblemsInStack;

import java.util.Stack;

public class RemoveDuplicates {
    static void main(String[] args) {
        String s = "abbaca";
        String ans = removeDuplicates(s);
        System.out.println(ans);
    }

    private static String removeDuplicates(String s) {
        if (s.length() == 1) {
            return s;
        }

        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (st.isEmpty()) {
                st.add(c);
                continue;
            }

            if (st.peek() == c) {
                st.pop();
            } else {
                st.push(c);
            }


        }
        StringBuilder ansString = new StringBuilder();
        for (char c : st) {
            ansString.append(c);
        }

        return ansString.toString();
    }
}
