package test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MatrixPRint {
    static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
