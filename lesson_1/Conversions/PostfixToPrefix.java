package lesson_1.Conversions;

import java.util.Stack;

import static lesson_1.Conversions.infixPrefix.isOperands;

public class PostfixToPrefix {
    static void main(String[] args) {
        String postfix = "abc*+d-";
        String ans = postfixToPrefix(postfix);
        System.out.println(ans);
    }

    private static String postfixToPrefix(String postfix) {
        Stack<String> Stack = new Stack<>();

        for (char ch : postfix.toCharArray()) {
            if (ch == ' ') continue;
            if (isOperands(ch)) Stack.push(Character.toString(ch));
            else {
                StringBuilder sc = new StringBuilder();
                String temp = Stack.pop();
                sc.append(ch);
                sc.append(Stack.pop());
                sc.append(temp);
                Stack.push(sc.toString());

            }


        }
        return Stack.pop();
    }


}
