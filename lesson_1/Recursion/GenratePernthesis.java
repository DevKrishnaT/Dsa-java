package lesson_1.Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenratePernthesis {
    static void main(String[] args) {
        int n = 1;
        List<String> ans = generateParenthesis(n);
    }

    private static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        BackTrack(list, new StringBuilder(), 0, 0, n);

        return list;
    }

    private static void BackTrack(List<String> list, StringBuilder current, int open, int closed, int n) {
        if (current.length() == n * 2) {
            list.add(current.toString());
            return;
        }

        if (open < n) {
            current.append("(");
            BackTrack(list, current, open + 1, closed, n);
            current.deleteCharAt(current.length() - 1);
        }

        if (closed < open) {
            current.append(")");
            BackTrack(list, current, open, closed + 1, n);
            current.deleteCharAt(current.length() - 1);
        }
        ;

    }
}
