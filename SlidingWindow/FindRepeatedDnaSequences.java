package SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class FindRepeatedDnaSequences {
    static void main(String[] args) {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> ans = findRepeatedDnaSequences(s);
        System.out.println(ans);
    }

    private static List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> set = new HashSet<>();
        List<String> ans = new ArrayList<>();
        int stratIndex = 0;
        int endIndex = 10;

        while (endIndex <= s.length()) {
            String curr = s.substring(stratIndex, endIndex);
            if (set.contains(curr)) {
                if (!ans.contains(curr)) {
                    ans.add(curr);
                }
            } else {
                set.add(curr);
            }
            endIndex++;
            stratIndex++;
        }
        return ans;
    }
}
