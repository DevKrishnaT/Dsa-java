package Hashing.revision;

public class IsAnagramBatter {
    static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        boolean ans = isAnagram(s, t);
        System.out.println(ans);
    }

    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];

        for (Character c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (Character c : t.toCharArray()) {
            freq[c - 'a']--;
        }

        for (int i : freq) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }
}
