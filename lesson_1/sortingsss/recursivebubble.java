package lesson_1.sortingsss;

import java.util.Arrays;

public class recursivebubble {
    public static void main(String[] args) {
        int[] arr = {124124, 12, 532, 5, 325, 235, 235, 23, 5623, 623, 6236, 326};
        bobbleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    private static void bobbleSort(int[] arr, int n) {
        if (n == 1) return;
        boolean swap = false;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int tmep = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = tmep;
                swap = true;
            }

        }
        if (!swap) return;
        bobbleSort(arr, n - 1);
    }
}
