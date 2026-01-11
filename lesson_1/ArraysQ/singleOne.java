package lesson_1.ArraysQ;

import java.util.Arrays;

public class singleOne {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};

        int ans = 0;
        for (int num : arr) {
            ans ^= num;
        }
        System.out.println(ans);


    }
}
