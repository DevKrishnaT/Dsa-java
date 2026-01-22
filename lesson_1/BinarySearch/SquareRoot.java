package lesson_1.BinarySearch;

import java.util.Arrays;

public class SquareRoot {
    public static void main(String[] args) {
        int x = 8;
        int left = 0;
        int right = x;
        int res = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;
            if (square > x) {
                right = mid - 1;
            } else if (square < x) {
                left = mid + 1;
                res = mid;
            } else {
                System.out.println(mid);
                break;
            }
        }
        System.out.println(res);

    }
}
