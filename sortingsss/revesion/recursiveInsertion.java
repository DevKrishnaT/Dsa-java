package sortingsss.revesion;

public class recursiveInsertion {
    static void main(String[] args) {
        int[] arr = {1, 23, 4, 534, 24, 45};

        recusive(arr, arr.length);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    private static void recusive(int[] arr, int n) {
        if (n <= 1) return;
        recusive(arr, n - 1);
        int key = arr[n - 1];
        int j = n - 2;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = key;
    }
}
