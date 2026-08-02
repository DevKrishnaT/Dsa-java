package Hashing;

import java.util.*;

public class FreqWords {
    static void main(String[] args) {
        String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        List<String> ans = toKFreq(words, 4);
        System.out.println(ans);
    }

    private static List<String> toKFreq(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String curr : words) {
            map.put(curr, map.getOrDefault(curr, 0) + 1);

        }

        ArrayList<String> ans = new ArrayList<>(map.keySet());
        Collections.sort(ans, (a, b) -> {
            if (map.get(a).equals(map.get(b))) {
                return a.compareTo(b);
            }

            return map.get(b) - map.get(a);
        });

        return ans.subList(0, k);

    }
}
