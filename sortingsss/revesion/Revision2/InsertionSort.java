package sortingsss.revesion.Revision2;

import java.util.Arrays;

public class InsertionSort {
    static void main(String[] args) {
        int[] arr = {2, 4, 6, 3, 24, 46};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
