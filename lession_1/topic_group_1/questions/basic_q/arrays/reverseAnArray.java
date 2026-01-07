package lession_1.topic_group_1.questions.basic_q.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class reverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 23, 3, 4, 5, 6, 67};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        Collections.reverse(list);
        System.out.println(list);

    }


}
