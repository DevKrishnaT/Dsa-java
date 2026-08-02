package Hashing;

import java.util.HashMap;
import java.util.Objects;

public class WordMapping {
    static void main(String[] args) {
        String pattern = "abba", s = "dog cat cat dog";
        boolean ans = wordPattern(pattern, s);
        System.out.println(ans);
    }

    private static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> pTos = new HashMap<>();
        HashMap<String, Character> sTop = new HashMap<>();
        int left = 0;

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            StringBuilder string = new StringBuilder();
            while (left < s.length() && s.charAt(left) != ' ') {
                string.append(s.charAt(left++));
            }
            if (string.toString().equals(" ")) return false;
            if (pTos.containsKey(c) && !Objects.equals(pTos.get(c), string.toString())) {
                return false;
            }

            if (sTop.containsKey(string.toString()) && sTop.get(string.toString()) != c) {
                return false;
            }

            pTos.put(c, string.toString());
            sTop.put(string.toString(), c);
            left++;

        }
        return left >= s.length();
    }
}
