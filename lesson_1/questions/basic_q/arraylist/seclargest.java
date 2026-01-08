package lesson_1.questions.basic_q.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class seclargest {
    public static void main(String[] args) {
        ArrayList<Integer> arrl = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 35, 124, 353, 12, 345, 232, 21));
        int secmax = 0;
        int max = 0;
        for (int i : arrl) {
            if (max < i) {
                secmax = max;
                max = i;
            } else if (secmax <= i) {
                secmax = i;
            }
        }
        System.out.println(secmax);

    }
}
