package lesson_1.ArraysQ;

import java.util.Arrays;

public class unionOfTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
        int arr1Size = 10;
        int arr2Size = 7;
        System.out.println(Arrays.toString(unionOfArray(arr1, arr2, arr1Size, arr2Size)));

    }

    private static int[] unionOfArray(int[] arr1, int[] arr2, int arr1Size, int arr2Size) {
        int[] unionArray = new int[arr1Size + arr2Size];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1Size && j < arr2Size) {
            if (arr1[i] < arr2[j]) {
                unionArray[k] = arr1[i];
                i++;
                k++;

            } else if (arr1[i] > arr2[j]) {
                unionArray[k] = arr2[j];
                k++;
                j++;

            } else {
                unionArray[k] = arr1[i];
                k++;
                i++;
                j++;
            }
        }
        while (i < arr1Size) {
            unionArray[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2Size) {
            unionArray[k] = arr2[j];
            k++;
            j++;
        }
        return Arrays.copyOf(unionArray, k);
    }
}
