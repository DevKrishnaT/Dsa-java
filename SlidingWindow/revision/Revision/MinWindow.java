package SlidingWindow.revision.Revision;

import java.util.HashMap;

public class MinWindow {
    static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABCA";

        String ans = minWindow(s, t);
    }

    private static String minWindow(String s, String t) {
        if (t.length() > s.length()) {
            return "";
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        HashMap<Character, Integer> collect = new HashMap<>();
        int toClear = map.size();
        int left = 0;
        int start = -1;
        int size = Integer.MAX_VALUE;
        for (int right = 0; right < s.length(); right++) {
            char curr = s.charAt(right);
            collect.put(curr, collect.getOrDefault(curr, 0) + 1);

            if (map.containsKey(curr) && collect.get(curr).intValue() == map.get(curr).intValue()) {
                toClear--;
            }

            while (toClear <= 0) {
                if ((right - left + 1) < size) {
                    size = right - left + 1;
                    start = left;
                }
                char remove = s.charAt(left);

                collect.put(remove, collect.get(remove) - 1);
                if (map.containsKey(remove) && collect.get(remove) < map.get(remove)) {
                    toClear++;
                }
                left++;
            }


        }

        return start == -1 ? "" : s.substring(start, start + size);


    }
}
