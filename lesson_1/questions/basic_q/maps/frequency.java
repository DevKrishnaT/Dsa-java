package lesson_1.questions.basic_q.maps;

import java.util.HashMap;

public class frequency {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int[] arr = {1, 2, 2, 3, 1, 4, 2};
        for (int i : arr) {

            hash.merge(i, 1, Integer::sum);

        }
        System.out.println(hash);
    }
}
