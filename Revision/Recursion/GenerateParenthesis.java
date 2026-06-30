package Revision.Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    static void main(String[] args) {
        int n = 4;
        List<String> ans = genrate(n);
        System.out.println(ans);
    }

    private static List<String> genrate(int n) {

        ArrayList<String> list = new ArrayList<>();
        if (n == 0) return list;

        solve(list, new StringBuilder(), 0, 0, n);
        return list;
    }

    private static void solve(ArrayList<String> list, StringBuilder curr, int open, int close, int n) {
        if (curr.length() == n * 2) {
            list.add(curr.toString());
            return;
        }
        ;

        if (open < n) {
            curr.append('(');
            solve(list, curr, open + 1, close, n);
            curr.deleteCharAt(curr.length() - 1);
        }

        if (open > close) {
            curr.append(')');
            solve(list, curr, open, close + 1, n);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}
