package javabasic.array;

import java.util.*;

public class ArrayMulti {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        Set<Integer> rows = new HashSet<>();
        Set<Integer> coloums = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] == 0) {
                    rows.add(i);
                    coloums.add(j);
                }
            }
        }
        for (int i : rows) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = 0;

            }
        }
        for (int i : coloums) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][i] = 0;

            }
        }
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

}
