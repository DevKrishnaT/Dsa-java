package lession_1.topic_group_1.questions.basic_q.BasicMathsq;

import java.util.ArrayList;
import java.util.Collections;

public class AllDivisorOPtimal {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = 36;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                list.add(i);

                if (i != n / i) {
                    list.add(n / i);
                }
            }
        }

        Collections.sort(list);
        System.out.println(list);

    }
}
