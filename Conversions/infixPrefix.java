package Conversions;

import java.util.Stack;

public class infixPrefix {
    static void main(String[] args) {
        String Infix = "x + y * z / w + u";
        String ans = prefix(Infix);
        System.out.println(ans);
    }

    private static String prefix(String infix) {
        StringBuilder reversed = new StringBuilder(infix).reverse();
        for (int i = 0; i < reversed.length(); i++) {
            if (reversed.charAt(i) == '(')
                reversed.setCharAt(i, ')');
            else if (reversed.charAt(i) == ')')
                reversed.setCharAt(i, '(');
        }
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (char ch : reversed.toString().toCharArray()) {
            if (ch == ' ') continue;
            if (isOperands(ch)) postfix.append(ch);
            else if (ch == '(') stack.push(ch);
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop();

            } else {
                while (!stack.isEmpty() && Precedence(ch) <= Precedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }


        }
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        postfix.reverse();

        return postfix.toString();
    }

    public static int Precedence(char ch) {
        return switch (ch) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    public static boolean isOperands(char ch) {
        return (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9');
    }
}
