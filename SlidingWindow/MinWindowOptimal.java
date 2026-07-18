package SlidingWindow;

import java.util.HashMap;

public class MinWindowOptimal {
    static void main(String[] args) {
        String s = "aDOBECODEBANC";
        String t = "aBC";
        String ans = minWindow(s, t);
        System.out.println(ans);
    }

    private static String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }

        HashMap<Character, Integer> target = new HashMap<>();
        for (char c : t.toCharArray()) {
            target.put(c, target.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> window = new HashMap<>();

        int formed = 0;
        int required = target.size();
        int minLen = Integer.MAX_VALUE;
        int left = 0;
        int start = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);


            if (target.containsKey(c) && window.get(c).intValue() == target.get(c).intValue()) {
                formed++;
            }

            while (formed == required) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }


                char remove = s.charAt(left);

                window.put(remove, window.get(remove) - 1);

                if (target.containsKey(remove) && window.get(remove) < target.get(remove)) {
                    formed--;
                }

                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
