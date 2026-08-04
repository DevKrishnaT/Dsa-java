package Strings;

import java.util.Objects;

public class AreAlmostEqual {
    static void main(String[] args) {
        String s1 = "bank", s2 = "kanb";
        boolean ans = areAlmostEqual(s1, s2);
    }

    private static boolean areAlmostEqual(String s1, String s2) {
        int first = -1;
        int sec = -1;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (first == -1) {
                    first = i;
                } else if (sec == -1) {
                    sec = i;
                } else {
                    return false;
                }
            }
        }

        if (first == -1) {
            return true;
        }
        if (sec == -1) {
            return false;
        }


        return s1.charAt(first) == s2.charAt(sec) && s1.charAt(sec) == s2.charAt(first);

    }
}
