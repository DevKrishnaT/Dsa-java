package lesson_1.BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class kthPostion {
    public static void main(String[] args) {
        int[] num1 = {2, 3, 6, 7, 9};
        int[] num2 = {1, 4, 8, 10};
        int k = 5;
        int ans = kthElement(num1, num2, k);
        System.out.println(ans);
    }

    public static int kthElement(int[] num1, int[] num2, int k) {
        if (num1.length > num2.length) return kthElement(num2, num1, k);

        int m = num1.length;
        int n = num2.length;

        int left = Math.max(0, k - n);
        int right = Math.min(k, m);
        while (left <= right) {
            int mid1 = (left + right) / 2;
            int mid2 = k - mid1;

            int l1 = (mid1 == 0) ? Integer.MIN_VALUE : num1[mid1 - 1];
            int l2 = (mid2 == 0) ? Integer.MIN_VALUE : num2[mid2 - 1];


            int r1 = (mid1 == m) ? Integer.MAX_VALUE : num1[mid1];
            int r2 = (mid2 == n) ? Integer.MAX_VALUE : num2[mid2];

            if (l1 <= r2 && l2 <= r1) {
                return Math.max(l1, l2);
            } else if (l1 > r2) {
                right = mid1 - 1;

            } else {
                left = mid1 + 1;
            }
        }
        return -1;
    }
}
