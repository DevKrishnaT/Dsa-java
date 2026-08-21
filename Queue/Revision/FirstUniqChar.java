package Queue.Revision;

import java.util.LinkedList;
import java.util.Queue;

public class FirstUniqChar {
    static void main(String[] args) {
        String s = "etcode";
        int ans = firstUniqChar(s);
        System.out.println(ans);
    }

    private static int firstUniqChar(String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }


        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;


    }
}
