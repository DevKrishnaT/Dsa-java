package lesson_1.questions.leetcode;

import java.util.HashMap;
import java.util.Map;

public class firstuniquechar {

    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();


        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), 2);
            }
        }
        System.out.println(map);
        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            if (m.getValue() == 1) {
                return s.indexOf(m.getKey());

            }
        }
        return -1;
    }

    ;

    public static void main(String[] args) {
        String s = "krishna";
        System.out.println(firstUniqChar(s));
    }


}
