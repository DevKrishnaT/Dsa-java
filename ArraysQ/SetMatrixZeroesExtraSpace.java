package ArraysQ;

import java.util.Arrays;

public class SetMatrixZeroesExtraSpace {
    static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setZeroes(matrix);
//        for (int[] arr : matrix) {
//            System.out.println(Arrays.toString(arr));
//        }
    }

    private static void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int[][] temp = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                temp[i][j] = matrix[i][j];
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    MakeZero(temp, i, j);
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = temp[i][j];
            }
        }


    }

    private static void MakeZero(int[][] temp, int row, int col) {
        for (int rows = 0; rows < temp.length; rows++) {
            for (int cols = 0; cols < temp[0].length; cols++) {
                if (row == rows || col == cols) {
                    temp[rows][cols] = 0;
                }
            }

        }
    }
}
