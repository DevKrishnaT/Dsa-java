package lesson_1.sortingsss;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {12, 423, 4, 325, 325, 34, 5634, 64, 645, 7};
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;

            }
            arr[j + 1] = key;

        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
