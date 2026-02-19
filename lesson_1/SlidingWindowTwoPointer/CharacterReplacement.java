package lesson_1.SlidingWindowTwoPointer;

import org.w3c.dom.ls.LSOutput;

public class CharacterReplacement {

    static void main(String[] args) {
        String s = "AABABBA";
        int k = 2;
        int ans = characterReplacement(s, k);
        System.out.println(ans);

    }

    private static int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0;
        int maxFreq = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'A']++;

            maxFreq = Math.max(maxFreq, count[s.charAt(right) - 'A']);

            while ((right - left + 1) - maxFreq > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}

