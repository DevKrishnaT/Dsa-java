package Strings;

import java.util.Stack;

public class RemoveOuter {
    static void main(String[] args) {
        String s = "(()())(())(()(()))";
//        String ans = removeOut(s);
        String ans2 = removeOut2(s);
        System.out.println(ans2);
    }

    private static String removeOut2(String s) {
        StringBuilder ans = new StringBuilder();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (count > 0) ans.append('(');
                count++;
            } else {
                count--;
                if (count > 0) ans.append(')');
            }
        }
        return ans.toString();
    }


    private static String removeOut(String s) {
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
