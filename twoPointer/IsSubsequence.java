package twoPointer;

import java.util.Objects;

public class IsSubsequence {
    static void main(String[] args) {
        String s = "b", t = "abc";
        boolean ans = isSubsequence(s, t);
        System.out.println(ans);
    }

    private static boolean isSubsequence(String s, String t) {
        if (Objects.equals(s, "")) {
            return true;
        }
        int start = 0;
        int start2 = 0;
        while (start < s.length() && start2 < t.length()) {
            if (s.charAt(start) == t.charAt(start2)) {
                start++;
            }
            start2++;
        }

        return start == s.length();
    }
}
