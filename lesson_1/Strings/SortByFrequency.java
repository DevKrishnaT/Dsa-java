package lesson_1.Strings;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortByFrequency {
    public static void main(String[] args) {
        String s = "tree";

        String ans2 = sortByFrequency2(s);

    }

    private static String sortByFrequency2(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> pq =
                new PriorityQueue<>((a, b) -> freq.get(b) - freq.get(a));

        pq.addAll(freq.keySet());
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            char p = pq.poll();
            int frequency = freq.get(p);
            while (frequency-- > 0) {
                sb.append(p);
            }
        }

        return sb.toString();
    }
}





