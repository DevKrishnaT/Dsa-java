package lesson_1.questions.basic_q.BasicMathsq;

import java.util.ArrayList;

public class allDivisor {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = 36;
        for (int i = 1; i <= n; i++) if (n % i == 0) list.add(i);
        System.out.println(list);


    }

}
