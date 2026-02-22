package Strings;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "abbcccba";
        String ans = longestPalindrome(s);
        System.out.println(ans);
    }

    private static String longestPalindrome(String s) {
        if (s == null || s.length() < 2) return s;
        int Stat = 0, End = 0;

        for (int i = 0; i < s.length(); i++) {

            int len1 = Expand(s, i, i);
            int len2 = Expand(s, i, i + 1);
            int maxLen = Math.max(len1, len2);

            if (maxLen > End - Stat) {
                Stat = i - (maxLen - 1) / 2;
                End = i + maxLen / 2;
            }


        }
        return s.substring(Stat, End + 1);
    }

    private static int Expand(String s, int l, int r) {
        while ((l >= 0 && r < s.length()) && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r - l - 1;
    }


}
