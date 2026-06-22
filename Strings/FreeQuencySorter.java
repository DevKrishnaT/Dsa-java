package Strings;

import java.util.HashMap;
import java.util.PriorityQueue;

public class FreeQuencySorter {
    static void main(String[] args) {
        String s = "Aabb";

        String ans = Sorter(s);
        System.out.println(ans);
    }

    private static String Sorter(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
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
