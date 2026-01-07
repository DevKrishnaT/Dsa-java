package lession_1.topic_group_1.questions.basic_q.maps;

import java.util.HashMap;
import java.util.Map;

public class highAndLow {
    public static void main(String[] args) {
        int[] arr = {1, 2, 12, 1, 3, 12, 1, 3, 34, 4};
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int i : arr) {
            freqMap.merge(i, 1, Integer::sum);
        }
        int smallest = Integer.MAX_VALUE;
        int minKey = 0;

        int largest = Integer.MIN_VALUE;
        int maxKey = 0;
        for (Map.Entry<Integer, Integer> ent : freqMap.entrySet()) {
            if (ent.getValue() > largest) {
                largest = ent.getValue();
                maxKey = ent.getKey();
            }

            if (ent.getValue() < smallest) {
                smallest = ent.getValue();
                minKey = ent.getKey();
                ;
            }
        }

        System.out.println("largest: " + maxKey + " smallest: " + minKey);

    }
}
