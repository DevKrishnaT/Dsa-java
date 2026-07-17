package SlidingWindow;

import java.util.HashSet;

public class LongestSubstring {
    static void main(String[] args) {
        String s = "abcabcbb";
        int ans = lengthOfLongestSubstring(s);
        System.out.println(ans);
    }

    private static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            while (set.contains(c)) {
                char now = s.charAt(left);
                set.remove(now);
                left++;

            }

            set.add(c);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
