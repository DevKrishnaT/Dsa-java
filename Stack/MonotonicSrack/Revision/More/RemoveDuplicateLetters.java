package Stack.MonotonicSrack.Revision.More;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class RemoveDuplicateLetters {
    static void main(String[] args) {
        String s = "cbacdcbc";
        String ans = removeDuplicateLetters(s);
        System.out.println(ans);
    }

    private static String removeDuplicateLetters(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        boolean[] seen = new boolean[26];

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            freq[ch - 'a']--;
            if (seen[ch - 'a']) {
                continue;
            }
            while (!stack.isEmpty() && stack.peek() > ch && freq[stack.peek() - 'a'] > 0) {
                seen[stack.peek() - 'a'] = false;
                stack.pop();
            }

            seen[ch - 'a'] = true;
            stack.push(ch);


        }

        StringBuilder ans = new StringBuilder();
        for (char ch : stack) {
            ans.append(ch);
        }


        return ans.toString();
    }
}
