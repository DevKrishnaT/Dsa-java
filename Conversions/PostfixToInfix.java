package Conversions;

import java.util.Stack;

import static Conversions.infixPrefix.isOperands;

public class PostfixToInfix {
    static void main(String[] args) {
        String postfix = "abcd^e-fgh*+^*+i-";
        String ans = infixConversion(postfix);
        System.out.println(ans);
    }

    private static String infixConversion(String postfix) {
        Stack<String> stack = new Stack<>();


        for (char ch : postfix.toCharArray()) {
            if (ch == ' ') continue;
            if (isOperands(ch)) stack.push(Character.toString(ch));
            else {
                StringBuilder ans = new StringBuilder();
                String temp = stack.pop();

                ans.append('(');
                ans.append(stack.pop());
                ans.append(ch);
                ans.append(temp);
                ans.append(')');
                stack.push(ans.toString());


            }


        }
        return stack.pop();
    }

}
