package lession_1.topic_group_1.questions.basic_q.maps;

import java.util.Arrays;
import java.util.HashMap;

public class freqArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 12, 1, 3, 12, 1, 3, 34, 4};
        HashMap<Integer, Integer> hashm = new HashMap<>();

        for (int i : arr) {
            hashm.merge(i, 1, Integer::sum);
        }
        System.out.println(hashm);
    }
}
