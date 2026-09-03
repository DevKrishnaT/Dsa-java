package Strings.Revision;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencySort {
    static void main(String[] args) {
        String s = "tree";
        String ans = frequencySort(s);
        System.out.println(ans);
    }

    private static String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet());

        StringBuilder ans = new StringBuilder();

        while (!pq.isEmpty()) {
            char p = pq.poll();
            int frequency = map.get(p);
            while (frequency-- > 0) {
                ans.append(p);
            }
        }

        return ans.toString();
    }
}
