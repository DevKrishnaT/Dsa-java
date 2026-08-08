package SlidingWindow.revision.Revision;

import java.util.HashSet;

public class LengthOfLongestSubstring {
    static void main(String[] args) {
        String s = "aa";

        int ans = lengthOfLongestSubstring(s);
        System.out.println(ans);
    }

    private static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left++));
            }
            set.add(s.charAt(right));

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
