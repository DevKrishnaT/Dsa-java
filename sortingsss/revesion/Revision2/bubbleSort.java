package sortingsss.revesion.Revision2;


import java.util.Arrays;

public class bubbleSort {
    static void main(String[] args) {
        int[] arr = {2, 4, 6, 3, 24, 46};
        sortBubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortBubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }

            }
            if (!swapped) return;
        }
    }
}
