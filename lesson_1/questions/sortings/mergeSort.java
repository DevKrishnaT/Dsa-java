package lesson_1.questions.sortings;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {124124, 12, 532, 5, 325, 235, 235, 23, 5623, 623, 6236, 326};
        mergeSorts(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSorts(int[] arr, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;
        mergeSorts(arr, left, mid);
        mergeSorts(arr, mid + 1, right);

        merge(arr, left, mid, right);

    }

    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        for (int i = 0; i < n1; i++) {
            lArr[i] = arr[left + i];
        }
        for (int i = 0; i < n2; i++) {
            rArr[i] = arr[mid + 1 + i];
        }

        int i = 0;
        int j = 0;
        int key = left;
        while (i < n1 && j < n2) {
            if (lArr[i] <= rArr[j]) {
                arr[key] = lArr[i];
                i++;
                key++;
            } else {
                arr[key] = rArr[j];
                j++;
                key++;
            }
        }
        while (i < n1) {
            arr[key++] = lArr[i++];
        }
        while (j < n2) {
            arr[key++] = rArr[j++];
        }
    }
}
