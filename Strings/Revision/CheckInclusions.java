package Strings.Revision;

import java.util.ArrayList;

public class CheckInclusions {
    static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaooo";
        boolean ans = checkInclusion(s1, s2);
        System.out.println(ans);
    }

    private static boolean checkInclusion(String s2, String s1) {
        if (s1.length() < s2.length()) {
            return false;
        }
        ArrayList<Integer> list = new ArrayList<>();
        int nonZeros = 0;
        int[] freq = new int[26];


        for (char c : s2.toCharArray()) {
            if (freq[c - 'a'] == 0) {
                nonZeros++;
            }

            freq[c - 'a']++;
        }


        int left = 0;

        for (int right = 0; right < s1.length(); right++) {
            int idx = s1.charAt(right) - 'a';

            if (freq[idx] == 1) {
                nonZeros--;
            } else if (freq[idx] == 0) {
                nonZeros++;
            }

            freq[idx]--;

            if (s2.length() <= right - left + 1) {
                if (nonZeros == 0) {
                    return true;
                }

                int leftIdx = s1.charAt(left) - 'a';

                if (freq[leftIdx] == -1) {
                    nonZeros--;
                } else if (freq[leftIdx] == 0) {
                    nonZeros++;
                }
                freq[leftIdx]++;
                left++;
            }
        }

        return false;
    }
}
