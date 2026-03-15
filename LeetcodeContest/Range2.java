package LeetcodeContest;

import java.util.concurrent.atomic.AtomicLong;

public class Range2 {
    static void main(String[] args) {
        long num = 1002;
        long temp = num;


        int comma = 0;
        while (temp >= 1000) {
            temp /= 1000;
            comma++;

        }
        int ans = 0;
        if (comma > 0) {
            ans += num - 1000;
        }
        ans += comma;
        System.out.println(ans);
    }
}
