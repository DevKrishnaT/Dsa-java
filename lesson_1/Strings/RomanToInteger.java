package lesson_1.Strings;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "II";
        int ans = romanToInt(s);
        System.out.println(ans);
    }

    private static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int ans = map.get(s.charAt(s.length() - 1));
        for (int i = s.length() - 2; i >= 0; i--) {
            char prev = s.charAt(i + 1);
            char currentRoman = s.charAt(i);

            int curent = map.get(currentRoman);
            if (ans > curent && currentRoman != prev) {
                ans = ans - curent;
            } else {
                ans = curent + ans;
            }

        }
        return ans;
    }
}
