package twoPointer;

import java.util.Arrays;

public class TwoArrayMult {
    static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 5, 2, 4, 2};
        int[] arr3 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i] * arr2[i];
        }

        System.out.println(Arrays.toString(arr3));
    }
}
