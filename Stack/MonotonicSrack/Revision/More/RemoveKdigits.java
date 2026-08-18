package Stack.MonotonicSrack.Revision.More;

import java.util.Stack;

public class RemoveKdigits {
    static void main(String[] args) {
        String num = "1432219";
        int k = 3;


        String ans = removeKDigits(num, k);
        System.out.println(ans);
    }

    private static String removeKDigits(String num, int k) {
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

        return sb.isEmpty() ? "" : sb.toString();
    }
}
