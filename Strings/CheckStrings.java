package Strings;

import java.util.ArrayList;
import java.util.HashMap;

public class CheckStrings {
    static void main(String[] args) {
        String s1 = "abcdba";
        String s2 = "cabdb";
        boolean ans = checkStrings(s1, s2);
        System.out.println(ans);
    }

    private static boolean checkStrings(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s2.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : s1.toCharArray()) {
            if (map.isEmpty()) return false;
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0) {
                    map.remove(c);
                }
            } else {
                return false;
            }
        }


        return map.isEmpty();
    }
}
