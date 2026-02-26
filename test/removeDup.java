package test;

import java.util.HashSet;
import java.util.Set;

public class removeDup {
    static void main(String[] args) {
        String s = "cbacdcbc";
        String ans = removeDuplicateLetters(s);
        System.out.println(ans);
    }

    private static String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        boolean[] seen = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        StringBuilder stack = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            int idx = current - 'a';

            if (seen[idx]) continue;

            while (stack.length() > 0 &&
                    stack.charAt(stack.length() - 1) > current &&
                    lastIndex[stack.charAt(stack.length() - 1) - 'a'] > i) {

                char removed = stack.charAt(stack.length() - 1);
                seen[removed - 'a'] = false;
                stack.deleteCharAt(stack.length() - 1);
            }

            stack.append(current);
            seen[idx] = true;
        }

        return stack.toString();
    }
}
