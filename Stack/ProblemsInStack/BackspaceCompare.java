package Stack.ProblemsInStack;

import java.util.Stack;

public class BackspaceCompare {
    static void main(String[] args) {
        String s = "ab#c", t = "ad#c";
        boolean ans = backspaceCompare(s, t);
        System.out.println(ans);
    }

    private static boolean backspaceCompare(String s, String t) {
        Stack<Character> stFs = new Stack<>();
        Stack<Character> stFt = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (!stFs.isEmpty()) {
                    stFs.pop();
                }
            } else {
                stFs.push(c);
            }
        }

        for (char c : t.toCharArray()) {
            if (c == '#') {
                if (!stFt.isEmpty()) {
                    stFt.pop();
                }
            } else {
                stFt.push(c);
            }
        }

        StringBuilder ansS = new StringBuilder();
        StringBuilder ansT = new StringBuilder();

        for (char c : stFs) {
            ansS.append(c);
        }

        for (char c : stFt) {
            ansT.append(c);
        }
        System.out.println(ansS);
        System.out.println(ansT);

        return ansT.toString().equals(ansS.toString());

    }
}
