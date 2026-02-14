package lesson_1.Conversions;

import java.util.Stack;

import static lesson_1.Conversions.infixPrefix.isOperands;

public class PrefixToPostfix {
    static void main(String[] args) {
        String prefix = "-+a*bcd";
        String ans = prefixToPostfix(prefix);
        System.out.println(ans);
    }

    private static String prefixToPostfix(String prefix) {
        String reversed = new StringBuilder(prefix).reverse().toString();
        Stack<String> Stack = new Stack<>();

        for (char ch : reversed.toCharArray()) {
            if (ch == ' ') continue;
            if (isOperands(ch)) Stack.push(Character.toString(ch));
            else {
                StringBuilder sc = new StringBuilder();
                sc.append(Stack.pop());
                sc.append(Stack.pop());
                sc.append(ch);

                Stack.push(sc.toString());
            }
        }
        return Stack.pop();
    }
}
