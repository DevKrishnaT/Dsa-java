package Strings.Revision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAnagrams {
    static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
        List<Integer> ans = findAnagrams(s, p);
        System.out.println(ans);
    }

    private static List<Integer> findAnagrams(String s, String p) {
        if (s.length() < p.length()) {
            return new ArrayList<>();
        }
        ArrayList<Integer> list = new ArrayList<>();
        int nonZeros = 0;
        int[] freq = new int[26];


        for (char c : p.toCharArray()) {
            if (freq[c - 'a'] == 0) {
                nonZeros++;
            }

            freq[c - 'a']++;
        }


        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            int idx = s.charAt(right) - 'a';

            if (freq[idx] == 1) {
                nonZeros--;
            } else if (freq[idx] == 0) {
                nonZeros++;
            }

            freq[idx]--;

            if (p.length() <= right - left + 1) {
                if (nonZeros == 0) {
                    list.add(left);
                }

                int leftIdx = s.charAt(left) - 'a';

                if (freq[leftIdx] == -1) {
                    nonZeros--;
                } else if (freq[leftIdx] == 0) {
                    nonZeros++;
                }
                freq[leftIdx]++;
                left++;
            }
        }

        return list;


    }
}
