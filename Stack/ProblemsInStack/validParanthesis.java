package Stack.ProblemsInStack;

import java.util.Stack;

public class validParanthesis {
    static void main(String[] args) {
        String s = "(){}[]";
        boolean ans = isValid(s);

    }

    private static boolean isValid(String s) {
        Stack<Character> storage = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                storage.push(ch);
            } else {
                if (storage.isEmpty()) return false;

                char top = storage.pop();

                if (top == '(' && ch != ')') return false;
                if (top == '{' && ch != '}') return false;
                if (top == '[' && ch != ']') return false;
            }
        }
        return storage.isEmpty();


    }

}
