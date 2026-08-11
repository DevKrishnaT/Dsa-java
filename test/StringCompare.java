package test;

public class StringCompare {
    static void main(String[] args) {
        String s = "Krishna";
        String t = "Krishna";

        boolean ans = isEqual(s, t);
        System.out.println(ans);
    }

    private static boolean isEqual(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
