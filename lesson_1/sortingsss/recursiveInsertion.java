package lesson_1.sortingsss;

import java.util.Arrays;

public class recursiveInsertion {
    public static void main(String[] args) {
        int[] arr = {234325, 325, 32, 532, 5342, 52, 35, 325, 235, 235, 346, 346, 1335, 32, 532, 642, 634, 342, 6234, 6234, 46};
        insertionsort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionsort(int[] arr, int n) {

        if (n <= 1) return;
        insertionsort(arr, n - 1);

        int last = arr[n - 1];
        int j = n - 2;
        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = last;
    }
}
