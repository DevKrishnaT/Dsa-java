package lesson_1.Conversions;

import java.util.Stack;

import static lesson_1.Conversions.infixPrefix.isOperands;

public class PrefixToInfix {
    static void main(String[] args) {
        String prefix = "*+ab-cd";
        String ans = prefixToInfix(prefix);
        System.out.println(ans);
    }

    private static String prefixToInfix(String prefix) {
        String reverse = new StringBuilder(prefix).reverse().toString();
        Stack<String> stack = new Stack<>();

        for (char ch : reverse.toCharArray()) {
            if (ch == ' ') continue;
            if (isOperands(ch)) stack.push(Character.toString(ch));
            else {
                if (stack.size() < 2)
                    throw new IllegalArgumentException("Invalid Prefix");

                String operand1 = stack.pop();
                String operand2 = stack.pop();

                String expr = "(" + operand1 + ch + operand2 + ")";
                stack.push(expr);
            }


        }
        return stack.pop();
    }
}
