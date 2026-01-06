package lession_1.topic_group_1.questions.basic_q.BasicMathsq;

import java.util.ArrayList;

public class GCD {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 20;
        int b = 28;
        System.out.println(gcd(a, b));


    }
}
