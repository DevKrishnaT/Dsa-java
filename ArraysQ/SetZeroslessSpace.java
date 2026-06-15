package ArraysQ;

import java.util.Arrays;

public class SetZeroslessSpace {
    static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setZeroes(matrix);
        for (int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }
    }

    private static void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int[] rowSpace = new int[row];
        int[] colSpace = new int[col];

        Arrays.fill(rowSpace, 1);
        Arrays.fill(colSpace, 1);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    MarkZeros(rowSpace, colSpace, i, j);
                }
            }
        }
        for (int i = 0; i < rowSpace.length; i++) {
            if (rowSpace[i] == 0) {
                makeAtMatrixRow(matrix, i);
            }
        }

        for (int i = 0; i < colSpace.length; i++) {
            if (colSpace[i] == 0) {
                makeAtMatrixCol(matrix, i);
            }
        }


    }

    private static void makeAtMatrixCol(int[][] matrix, int i) {
        for (int j = 0; j < matrix.length; j++) {
            matrix[j][i] = 0;
        }
    }

    private static void makeAtMatrixRow(int[][] matrix, int i) {
        for (int j = 0; j < matrix[0].length; j++) {
            matrix[i][j] = 0;
        }
    }

    private static void MarkZeros(int[] rowSpace, int[] colSpace, int row, int col) {
        for (int i = 0; i < rowSpace.length; i++) {
            if (i == row) {
                rowSpace[i] = 0;
            }
        }

        for (int i = 0; i < colSpace.length; i++) {
            if (i == col) {
                colSpace[i] = 0;
            }
        }
    }


}
