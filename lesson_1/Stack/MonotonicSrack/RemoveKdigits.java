package lesson_1.Stack.MonotonicSrack;

import java.util.Stack;

public class RemoveKdigits {
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
        StringBuilder sb = new StringBuilder();
        for (char ch : stack) {
            sb.append(ch);
        }

        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.isEmpty() ? "0" : sb.toString();
    }
}
