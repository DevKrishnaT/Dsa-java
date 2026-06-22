package Strings;

import java.util.Stack;

public class Parenthesesnesting {
    static void main(String[] args) {
        String s = "(1)+((2))+(((3)))";
        int ans = calDepth(s);
        System.out.println(ans);
    }

    private static int calDepth(String s) {
        int depth = 0;
        int maxDepth = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                depth++;
                maxDepth = Math.max(depth, maxDepth);
            } else if (c == ')') {
                depth--;
            }
        }
        return maxDepth;
    }
}
