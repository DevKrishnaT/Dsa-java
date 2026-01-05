package lession_1.topic_group_1.questions.basic_q.maps;

import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        HashMap<Integer, Integer> storeg = new HashMap<>();
        int[] arr = {2, 7, 11, 15};
        int Target = 9;

        for (int i : arr) {
            if (storeg.containsKey(Target - i)) {
                System.out.println(true);
            } else {
                storeg.put(i, storeg.getOrDefault(i, -1) + 1);
            }
        }
        System.out.println(storeg);


    }
}
