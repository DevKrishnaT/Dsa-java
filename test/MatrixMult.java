package test;

public class MatrixMult {
    static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int row = matrix.length;
        int colsA = matrix[0].length;
        int colsB = matrix2[0].length;

        int[][] result = new int[row][colsB];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrix[i][k] * matrix2[k][j];
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print("{ ");
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println("}");
        }
    }
}
