package SlidingWindow.revision.Revision;

import java.util.HashMap;

public class CharacterReplacement {
    static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        int ans = characterReplacement(s, k);
        System.out.println(ans);
    }

    private static int characterReplacement(String s, int k) {
        int left = 0;
        int max = 0;
        int[] count = new int[26];
        int maxFreq = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            count[c - 'A']++;
            maxFreq = Math.max(maxFreq, count[c - 'A']);

            while ((i - left + 1) - maxFreq > k) {
                count[s.charAt(left) - 'A']--;
                left++;

            }
            max = Math.max(max, i - left + 1);
        }

        return max;

    }
}
