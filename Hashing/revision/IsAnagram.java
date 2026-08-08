package Hashing.revision;

import java.util.HashMap;

public class IsAnagram {
    static void main(String[] args) {
        String s = "anagram", t = "cat";
        boolean ans = isAnagram(s, t);
        System.out.println(ans);
    }

    private static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (Character c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Character c : t.toCharArray()) {
            if (!map.containsKey(c)) {
                return false;
            } else {
                map.put(c, map.get(c) - 1);

                if (map.get(c) == 0) {
                    map.remove(c);
                }
            }
        }

        return map.isEmpty();
    }
}
