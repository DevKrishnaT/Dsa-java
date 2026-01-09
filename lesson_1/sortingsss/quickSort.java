package lesson_1.sortingsss;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {1124, 124, 124, 123, 423, 523, 5, 346, 3423, 42, 1, 56, 34567, 347, 347,};
        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    private static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pividx = partiatio(arr, low, high);

            quicksort(arr, low, pividx - 1);
            quicksort(arr, pividx + 1, high);
        }
    }

    private static int partiatio(int[] arr, int low, int high) {
        int pivit = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivit) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = pivit;
        arr[high] = temp;
        return i + 1;
    }


}
