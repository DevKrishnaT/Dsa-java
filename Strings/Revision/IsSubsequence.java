package Strings.Revision;

public class IsSubsequence {
    static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        boolean ans = isSubsequence(s, t);
        System.out.println(ans);
    }

    private static boolean isSubsequence(String s, String t) {
        if (t.length() < s.length()) {
            return false;
        }

        int left = 0;
        int right = 0;

        while (left < s.length() && right < t.length()) {
            if (s.charAt(left) == t.charAt(right)) {
                left++;
            }
            right++;
        }

        return left == s.length();
    }
}
