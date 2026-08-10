package Stack.ProblemsInStack;

import java.util.Stack;

public class MakeGood {
    static void main(String[] args) {
        String s = "leEeetcode";
        String ans = makeGood(s);
        System.out.println(ans);
    }

    private static String makeGood(String s) {

        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!st.isEmpty() && Character.toLowerCase(st.peek()) == Character.toLowerCase(ch) && st.peek() != ch) {
                st.pop();
            } else {
                st.push(ch);
            }
        }

        StringBuilder ans = new StringBuilder();

        for (char c : st) {
            ans.append(c);
        }

        return ans.toString();
    }
}
