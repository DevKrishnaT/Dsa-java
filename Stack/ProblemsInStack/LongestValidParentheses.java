package Stack.ProblemsInStack;

import java.util.Stack;

public class LongestValidParentheses {
    static void main(String[] args) {
        String s = ")()())";
        int ans = longestValidParentheses(s);
        System.out.println(ans);
    }

    private static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();

                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    max = Math.max(max, i - stack.peek());
                }
            }
        }

        return max;
    }
}
