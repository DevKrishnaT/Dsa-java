package lesson_1.Recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
    static void main(String[] args) {

        List<String> list = new ArrayList<>();
        String digits = "2";
        if (digits == null || digits.length() == 0) {
            System.out.println("ange mat jao ");
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
        backTrack(digits, 0, new StringBuilder(), list, map);
        System.out.println(list);

    }

    private static void backTrack(String digits, int idx, StringBuilder current, List<String> result, String[] map) {

        if (idx == digits.length()) {
            result.add(current.toString());
            return;
        }

        String latter = map[digits.charAt(idx) - '0'];


        for (char c : latter.toCharArray()) {
            current.append(c);
            backTrack(digits, idx + 1, current, result, map);
            current.deleteCharAt(current.length() - 1);

        }
    }
}
