package lession_1.topic_group_1.questions.basic_q.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class duplicate {
    public static void main(String[] args) {
        ArrayList<Object> res = new ArrayList<>();
        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 1, 4));

        for (int i : a1) {
            if (!res.contains(i)) {
                res.add(i);
            }

        }
        System.out.println(res);
    }
}
