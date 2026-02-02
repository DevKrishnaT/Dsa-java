package lesson_1.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class PalindromicPartition {
    static void main(String[] args) {
        String s = "aab";

        List<List<String>> list = new ArrayList<>();
        Partition(list, 0, s, new ArrayList<>(), new StringBuilder());
        System.out.println(list);
    }

    private static void Partition(List<List<String>> list, int idx, String s, ArrayList<String> Curr, StringBuilder SubString) {
        if (idx == s.length()) {
            list.add(new ArrayList<>(Curr));
        }


        for (int i = idx; i < s.length(); i++) {
            SubString = new StringBuilder(s.substring(idx, i + 1));

            if (isPalidrome(SubString)) {
                Curr.add(SubString.toString());
                Partition(list, i + 1, s, Curr, SubString);
                Curr.remove(Curr.size() - 1);
            }
        }

    }

    private static boolean isPalidrome(StringBuilder subString) {
        String original = subString.toString();
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }


}
