package RecursionAgain.RealQ;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    static void main(String[] args) {
        int n = 3;
        List<String> ans = generateParenthesis(n);
        System.out.println(ans);
    }

    private static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        genrate(list, n, new StringBuilder(), 0, 0);
        return list;
    }

    private static void genrate(List<String> list, int n, StringBuilder formate, int close, int open) {
        if (formate.length() == n * 2) {
            list.add(new String(formate));
            return;
        }


        if (open < n) {
            formate.append("(");
            genrate(list, n, formate, close, open + 1);
            formate.deleteCharAt(formate.length() - 1);
        }

        if (open > close) {
            formate.append(')');
            genrate(list, n, formate, close + 1, open);
            formate.deleteCharAt(formate.length() - 1);
        }
    }
}
