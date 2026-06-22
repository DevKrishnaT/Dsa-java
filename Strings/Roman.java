package Strings;

import java.util.HashMap;
import java.util.Map;

public class Roman {
    static void main(String[] args) {
        String s = "III";
        int ans = romanToInt(s);
        System.out.println(ans);

    }

    private static int romanToInt(String s) {
        Map<Character, Integer> map = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );
        int ans = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (map.get(c) < ans) {
                ans -= map.get(c);

            } else {

                ans += map.get(c);

                while (i > 0 && s.charAt(i) == s.charAt(i - 1)) {
                    i--;
                    ans += map.get(s.charAt(i));
                }


            }
        }

        return ans;


    }
}
