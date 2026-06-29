package Revision.Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenrateParentheses {
    static void main(String[] args) {
        int n = 3;
        List<String> ans = genrate(n);
        System.out.println(ans);
    }

    private static List<String> genrate(int n) {
        List<String> list = new ArrayList<>();
        make(list, new StringBuilder(), 0, 0, n);
        return list;
    }

    private static void make(List<String> list, StringBuilder current, int open, int close, int n) {
        if (current.length() == n * 2) {
            list.add(current.toString());
            return;
        }

        if (open < n) {
            current.append('(');
            make(list, current, open + 1, close, n);
            current.deleteCharAt(current.length() - 1);
        }

        if (close < open) {
            current.append(')');
            make(list, current, open, close + 1, n);
            current.deleteCharAt(current.length() - 1);
        }

    }


}
