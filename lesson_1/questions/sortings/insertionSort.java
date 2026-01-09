package lesson_1.questions.sortings;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {12, 21, 4, 214, 3254, 325, 325, 235, 23, 6342, 6};
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIdex] > arr[j]) {
                    minIdex = j;
                }
                int temp = arr[i];
                arr[i] = arr[minIdex];
                arr[minIdex] = temp;

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
