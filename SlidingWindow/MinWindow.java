package SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MinWindow {
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

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> set = new HashMap<>();
        for (char c : t.toCharArray()) {
            set.put(c, set.getOrDefault(c, 0) + 1);
        }
        int left = 0;
        StringBuilder minLength = new StringBuilder();
        int min = Integer.MAX_VALUE;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            map.put(c, map.getOrDefault(c, 0) + 1);

            if (right - left + 1 >= t.length()) {
                while (isValid(map, set)) {
                    if (right - left + 1 < min) {
                        min = right - left + 1;
                        minLength.setLength(0);
                        minLength.append(s.substring(left, right + 1));
                    }
                    c = s.charAt(left);
                    map.put(c, map.get(c) - 1);
                    if (map.get(c) == 0) {
                        map.remove(c);
                    }
                    left++;
                }
            }

        }
        return minLength.toString();
    }

    private static boolean isValid(HashMap<Character, Integer> map, HashMap<Character, Integer> set) {
        for (Map.Entry<Character, Integer> entry : set.entrySet()) {
            if (!map.containsKey(entry.getKey()) ||
                    map.get(entry.getKey()) < entry.getValue()) {
                return false;
            }
        }
        return true;
    }
}
