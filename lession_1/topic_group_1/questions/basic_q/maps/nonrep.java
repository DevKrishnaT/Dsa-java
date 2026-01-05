package lession_1.topic_group_1.questions.basic_q.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class nonrep {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Integer> l1 = new LinkedHashMap<>();
        int[] arr = {4, 5, 1, 2, 1, 4, 5};

        for (int i : arr) {
            if (l1.containsKey(i)) {
                l1.put(i, 2);
            } else {
                l1.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> ente : l1.entrySet()) {
            if (ente.getValue() == 1) {
                System.out.println(ente.getKey());
            }
        }
    }
}
