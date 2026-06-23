package sortingsss.revesion.Revision2;

import java.util.Arrays;

public class MergeSort {
    static void main(String[] args) {
        int[] arr = {1, 23, 4, 534, 24, 45};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        merge(arr, left, right);


    }

    private static void merge(int[] arr, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;

        merge(arr, left, mid);
        merge(arr, mid + 1, right);

        mergeFun(arr, left, mid, right);
    }

    private static void mergeFun(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] ArrL = new int[n1];
        int[] ArrR = new int[n2];

        for (int i = 0; i < n1; i++) {
            ArrL[i] = arr[left + i];
        }

        for (int i = 0; i < n2; i++) {
            ArrR[i] = arr[mid + i + 1];
        }
        int i = 0;
        int j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (ArrL[i] <= ArrR[j]) {
                arr[k] = ArrL[i];
                i++;
                k++;
            } else {
                arr[k] = ArrR[j];
                j++;
                k++;
            }
        }

        while (i < n1) {
            arr[k++] = ArrL[i++];
        }
        while (j < n2) {
            arr[k++] = ArrR[j++];
        }
    }
}
