package SlidingWindow.revision;

import java.util.HashMap;

public class MinWindow {
    static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String ans = minWindow(s, t);
        System.out.println(ans);
    }

    private static String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int size = Integer.MAX_VALUE;
        int toCorrect = map.size();
        int start = -1;
        HashMap<Character, Integer> collect = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char curr = s.charAt(right);
            collect.put(curr, collect.getOrDefault(curr, 0) + 1);
            if (map.containsKey(curr)
                    && collect.get(curr).intValue() == map.get(curr).intValue()) {
                toCorrect--;
            }

            while (toCorrect <= 0) {

                if (right - left + 1 < size) {
                    size = right - left + 1;
                    start = left;
                }


                collect.put(s.charAt(left), collect.get(s.charAt(left)) - 1);
                if (map.containsKey(s.charAt(left))
                        && collect.get(s.charAt(left)) < map.get(s.charAt(left))) {
                    toCorrect++;
                }
                left++;
            }
        }
        return start == -1 ? "" : s.substring(start, start + size);

    }
}
