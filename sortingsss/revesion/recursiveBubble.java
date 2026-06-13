package sortingsss.revesion;

public class recursiveBubble {
    static void main(String[] args) {
        int[] arr = {1, 23, 4, 534, 24, 45};
        recursive(arr, arr.length);
    }

    private static void recursive(int[] arr, int n) {
        if (n == 1) return;
        boolean bubble = false;
        for (int i = 0; i < n; i++) {
            if (arr[i + 1] < arr[i]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                bubble = true;
            }
        }

        if (!bubble) return;

        recursive(arr, n - 1);
    }


}
