package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAnagrams {
    static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> ans = findAnagrams(s, p);
        System.out.println(ans);
    }

    private static List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();
        if (s.length() < p.length()) {
            return list;
        }

        int[] freq = new int[26];
        int nonZeros = 0;
        for (char c : p.toCharArray()) {
            int index = c - 'a';
            if (freq[index] == 0) {
                nonZeros++;
            }
            freq[index]++;
        }
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            int index = s.charAt(right) - 'a';

            if (freq[index] == 1) {
                nonZeros--;
            } else if (freq[index] == 0) {
                nonZeros++;
            }

            freq[index]--;

            if (p.length() <= right - left + 1) {
                if (nonZeros == 0) {
                    list.add(left);
                }

                index = s.charAt(left) - 'a';

                if (freq[index] == -1) {
                    nonZeros--;
                } else if (freq[index] == 0) {
                    nonZeros++;
                }
                freq[index]++;
                left++;
            }

        }
        return list;
    }
}
