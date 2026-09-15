package RecursionAgain.RealQ;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    static void main(String[] args) {
        List<String> ans = generateParenthesis(3);
        System.out.println(ans);
    }

    private static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();

        if (n == 0) return list;


        FormParenthesis(list, new StringBuilder(), 0, 0, n);
        return list;
    }

    private static void FormParenthesis(List<String> list, StringBuilder string, int open, int close, int n) {
        if (string.length() == n * 2) {
            list.add(string.toString());
            return;
        }


        if (open < n) {
            string.append("(");
            FormParenthesis(list, string, open + 1, close, n);
            string.deleteCharAt(string.length() - 1);
        }

        if (open > close) {
            string.append(")");
            FormParenthesis(list, string, open, close + 1, n);
            string.deleteCharAt(string.length() - 1);
        }

    }
}
