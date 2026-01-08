package lesson_1.sortingsss;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {41, 9, 9, 48, 11, 2, 11, 12, 28, 10, 15, 4, 16, 48};
        // code here
        for (int i = 0; i < arr.length; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }

            }
            if (!swap) break;

        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
