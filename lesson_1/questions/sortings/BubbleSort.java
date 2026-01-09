package lesson_1.questions.sortings;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {234, 325, 32, 634, 6, 324, 324, 325, 32, 532, 623, 6, 236, 2346, 326, 26};
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
        System.out.println(Arrays.toString(arr));
    }
}
