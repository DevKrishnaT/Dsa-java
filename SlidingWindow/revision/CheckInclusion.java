package SlidingWindow.revision;

import java.util.HashMap;

public class CheckInclusion {
    static void main(String[] args) {
        String s1 = "abc", s2 = "bbbca";
        boolean ans = checkInclusion(s1, s2);
        System.out.println(ans);
    }

    private static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] freq = new int[26];
        int NonZeros = 0;
        for (char c : s1.toCharArray()) {
            int idx = c - 'a';
            if (freq[idx] == 0) {
                NonZeros++;
            }
            freq[idx]++;
        }


        int left = 0;

        for (int i = 0; i < s2.length(); i++) {
            int idx = s2.charAt(i) - 'a';

            if (freq[idx] == 1) {
                NonZeros--;
            } else if (freq[idx] == 0) {
                NonZeros++;
            }
            freq[idx]--;


            if (i - left + 1 >= s1.length()) {
                if (NonZeros == 0) {
                    return true;
                }

                idx = s2.charAt(left) - 'a';

                if (freq[idx] == 0) {
                    NonZeros++;
                } else if (freq[idx] == -1) {
                    NonZeros--;
                }
                freq[idx]++;
                left++;
            }

        }
        return false;
    }
}
