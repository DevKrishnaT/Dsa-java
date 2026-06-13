package sortingsss.revesion;

public class QuickSort {
    static void main(String[] args) {
        int[] arr = {1, 23, 4, 534, 24, 45};

        quickSort(arr);
    }

    private static void quickSort(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        quickAlgo(arr, low, high);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    private static void quickAlgo(int[] arr, int low, int high) {
        if (low < high) {
            int pivit = partition(arr, low, high);

            quickAlgo(arr, low, pivit - 1);
            quickAlgo(arr, pivit + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
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
