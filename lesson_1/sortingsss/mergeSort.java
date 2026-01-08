package lesson_1.sortingsss;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {12, 4, 214, 1, 412, 423, 5, 235, 23, 5234, 534, 634, 5, 13, 12, 12, 4123, 4523, 5, 346, 345, 12, 3412, 145, 23, 54, 734, 73, 734, 5, 24, 1223, 5};
        mergeSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

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
        int k = left;

        while (i < n1 && j < n2) {
            if (lArr[i] <= rArr[j]) {
                arr[k] = lArr[i];
                i++;
                k++;
            } else {
                arr[k] = rArr[j];
                j++;
                k++;

            }

        }
        while (i < n1) {
            arr[k++] = lArr[i++];
        }
        while (j < n2) {
            arr[k++] = rArr[j++];
        }
    }
}
