package lesson_1.SlidingWindowTwoPointer;

import java.util.HashMap;

public class MinWindow {
    static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
//        String s = "AA";
//        String t = "AA";
        String ans = minWindow(s, t);
        System.out.println(ans);
    }

    private static String minWindow(String s, String t) {
        if (t.length() > s.length()) return "";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);
        int required = t.length();

        int left = 0;
        int minLength = Integer.MAX_VALUE;
        int start = 0;
        for (int right = 0; right < s.length(); right++) {
            char curr = s.charAt(right);
            if (map.containsKey(curr)) {
                if (map.get(curr) > 0) {
                    required--;
                }
                map.put(curr, map.get(curr) - 1);
            }
            while (required == 0) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }
                char leftChar = s.charAt(left);

                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);
                    if (map.get(leftChar) > 0) {
                        required++;
                    }
                }

                left++;
            }


        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);

    }

    private static String minWindow2(String s, String t) {

        if (t.length() > s.length()) return "";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : t.toCharArray()) {
            map.put(ch, 0);
        }
        System.out.println(map);

        String ans = "";
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char curr = s.charAt(right);
            if (map.containsKey(curr)) {
                map.put(curr, map.get(curr) + 1);
            }


            while (!map.containsValue(0)) {
                if (ans.isEmpty() || ans.length() > right - left + 1) {
                    ans = s.substring(left, right + 1);
                }
                if (map.containsKey(s.charAt(left))) {
                    map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                }

                left++;

            }

        }
        return ans;
    }
}
