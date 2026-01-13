package lesson_1.ArraysQ;

import java.util.Arrays;

public class SetMatrikZero {
    public static void main(String[] args) {
        int[][] matrix = {{0, 8, 2, 9}, {3, 4, 0, 2}, {1, 3, 1, 5}};
        int rows = matrix.length;
        int coloms = matrix[0].length;

        int col0 = 1;

        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) {
                col0 = 0;
            }
            for (int j = 0; j < coloms; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }

        }


        for (int i = rows - 1; i >= 0; i--) {
            for (int j = coloms - 1; j >= 1; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }

            }
            if (col0 == 0) {
                matrix[i][0] = 0;
            }

        }


    }


}
