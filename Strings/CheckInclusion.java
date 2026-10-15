package Strings;

import java.util.Arrays;

public class CheckInclusion {
    static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaooo";
        boolean ans = checkInclusion(s1, s2);
        System.out.println(ans);
    }

    private static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }


        int[] freq = new int[26];
        int nonZeros = 0;

        for (char cur : s1.toCharArray()) {
            if (freq[cur - 'a'] == 0) {
                nonZeros++;
            }

            freq[cur - 'a']++;
        }

        int left = 0;
        for (int right = 0; right < s2.length(); right++) {
            int idx = s2.charAt(right) - 'a';
            if (freq[idx] == 1) {
                nonZeros--;
            } else if (freq[idx] == 0) {
                nonZeros++;
            }
            freq[idx]--;

            if (right - left + 1 >= s1.length()) {
                if (nonZeros == 0) {
                    return true;
                }

                idx = s2.charAt(left) - 'a';

                if (freq[idx] == 0) {
                    nonZeros++;
                } else if (freq[idx] == -1) {
                    nonZeros--;
                }
                freq[idx]++;
                left++;
            }


        }
        return false;

    }
}
