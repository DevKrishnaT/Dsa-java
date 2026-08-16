package Stack.MonotonicSrack.Revision;

import java.util.Stack;

public class RemoveKDigits {
    static void main(String[] args) {
        String num = "1432219";
        int k = 3;
        String ans = removeKdigits(num, k);
        System.out.println(ans);
    }

    private static String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();

        for (char ch : num.toCharArray()) {
            while (!stack.isEmpty() && k > 0 && stack.peek() > ch) {
                stack.pop();
                k--;
            }

            stack.push(ch);
        }


        while (k > 0) {
            stack.pop();
            k--;
        }

        StringBuilder ans = new StringBuilder();
        for (char ch : stack) {
            ans.append(ch);
        }

        while (ans.length() > 1 && ans.charAt(0) == '0') {
            ans.deleteCharAt(0);
        }


        return ans.isEmpty() ? "0" : ans.toString();

    }
}
