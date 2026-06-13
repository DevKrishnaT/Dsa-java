package sortingsss.revesion;

public class mergeSort {
    static void main(String[] args) {
        int[] arr = {1, 23, 4, 534, 24, 45};

        MergeSort(arr);
    }

    private static void MergeSort(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        mergesort(arr, left, right);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    private static void mergesort(int[] arr, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;

        mergesort(arr, left, mid);
        mergesort(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        for (int i = 0; i < n1; i++) {
            lArr[i] = arr[left + i];
        }

        for (int i = 0; i < n2; i++) {
            rArr[i] = arr[mid + i + 1];
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
            arr[k] = lArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rArr[j];
            j++;
            k++;
        }
    }
}
