package Strings.Revision;

public class RemoveOuterParenthesesOptimal {
    static void main(String[] args) {
        String s = "(()())(())";
        String ans = removeOuterParentheses(s);
        System.out.println(ans);
    }

    private static String removeOuterParentheses(String s) {

        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (count > 0) sb.append('(');
                count++;
            } else {
                count--;
                if (count > 0) sb.append(')');
            }
        }

        return sb.toString();
    }
}
