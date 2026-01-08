package lesson_1.questions.basic_q.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class revrse {
    public static void main(String[] args) {
        ArrayList<Integer> arrl = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = arrl.size() - 1; i >= 0; i--) {
            res.add(arrl.get(i));
        }
        ;
        System.out.println(res);


    }
}
