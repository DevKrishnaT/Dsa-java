package RecursionAgain.RealQ;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
    static void main(String[] args) {
        String digits = "23745";
        List<String> ans = letterCombinations(digits);
        System.out.println(ans);
    }

    private static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return null;
        }
        String[] map = {
                "",
                "",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };
        findCombinations(digits, list, 0, new StringBuilder(), map);
        return list;
    }

    private static void findCombinations(String digits, List<String> list, int idx, StringBuilder current, String[] map) {
        if (idx == digits.length()) {
            list.add(current.toString());
            return;
        }


        String latter = map[digits.charAt(idx) - '0'];

        for (char c : latter.toCharArray()) {
            current.append(c);
            findCombinations(digits, list, idx + 1, current, map);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
