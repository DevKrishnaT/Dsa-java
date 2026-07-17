package SlidingWindow;

import java.util.Arrays;

public class PermutationInString {
    static void main(String[] args) {
        String s1 = "odibe";
        String s2 = "eidboaoo";
        boolean ans = checkInclusion(s1, s2);
        System.out.println(ans);
    }

    private static boolean checkInclusion(String s1, String s2) {
        int[] count = new int[26];
        for (char c : s1.toCharArray()) {
            count[c - 'a']++;
        }
        int left = 0;
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);

            count[c - 'a']--;
            if (i >= s1.length() - 1) {
                if (isValid(count)) {
                    return true;
                }
                count[s2.charAt(left) - 'a']++;
                left++;
            }
        }

        return false;
    }

    private static boolean isValid(int[] count) {

        for (int num : count) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }
}
