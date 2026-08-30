package QuickRevision;

public class IsSubsequence {
    static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        boolean ans = isSubsequence(s, t);
        System.out.println(ans);
    }

    private static boolean isSubsequence(String s, String t) {
        int idx1 = 0;
        int idx2 = 0;

        while (idx1 < s.length() && idx2 < t.length()) {
            if (s.charAt(idx1) == t.charAt(idx2)) {
                idx1++;
            }

            idx2++;
        }

        return idx1 == s.length();
    }
}
