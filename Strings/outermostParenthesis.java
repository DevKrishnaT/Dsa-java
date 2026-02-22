package Strings;

public class outermostParenthesis {
    public static void main(String[] args) {
        String s = "(()())(())";
        String ans = removeOuterParentheses(s);
        System.out.println(ans);
    }

    private static String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (count > 0) sb.append(ch);
                count++;
            } else {
                count--;
                if (count > 0) sb.append(ch);
            }
        }
        return sb.toString();
    }

}
