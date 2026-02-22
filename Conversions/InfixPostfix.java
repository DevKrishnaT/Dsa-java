package Conversions;

import java.util.Stack;

public class InfixPostfix {
    static void main(String[] args) {
        String infix = "((a+(b*(((c^d)-e)^(f+(g*h)))))-i)";

        String postfix = infixPostfix(infix);
        System.out.println(postfix);
    }

    private static String infixPostfix(String infix) {
        Stack<Character> operators = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (char curr : infix.toCharArray()) {
            if (curr == ' ') {

                continue;

            }

            if (curr >= 'A' && curr <= 'Z' || curr >= 'a' && curr <= 'z' || curr >= '0' && curr <= '9') {
                postfix.append(curr);
            } else if (curr == '(') {
                operators.push(curr);

            } else if (curr == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {

                    postfix.append(operators.pop());

                }
                operators.pop();

            } else {

                while (!operators.isEmpty() && Precidence(curr) <= Precidence(operators.peek())) {
                    postfix.append(operators.pop());
                }
                operators.push(curr);


            }


        }
        while (!operators.isEmpty()) {
            postfix.append(operators.pop());
        }


        return postfix.toString();
    }

    public static int Precidence(char ch) {
        return switch (ch) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }
}
