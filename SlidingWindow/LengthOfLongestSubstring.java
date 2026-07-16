package SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;

public class LengthOfLongestSubstring {
    static void main(String[] args) {
        String s = "abcabcbb";
        int ans = length(s);
        System.out.println(ans);
    }

    private static int length(String s) {
        int left = 0;
        int max = 0;
        
        HashSet<Character> set = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);

            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(c);

            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
