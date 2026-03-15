package LeetcodeContest;

import java.sql.SQLOutput;

public class commasrange {
    static void main(String[] args) {
        int num = 1000;

        int ans = num - 1000;
        ans = ans + 1;
        if (ans <= 0) {
            ans = 0;
        } else {
            System.out.println(ans);
        }
        System.out.println(ans);
    }
}
