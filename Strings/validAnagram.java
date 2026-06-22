package Strings;

public class validAnagram {
    static void main(String[] args) {
        String s = "anagram";
        String t = "nagaramm";
        boolean ans = isValid(s, t);
        System.out.println(ans);
    }

    private static boolean isValid(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char n : t.toCharArray()) {
            freq[n - 'a']--;
        }

        for (int x : freq) {
            if (x != 0) return false;
        }

        return true;
    }
}
