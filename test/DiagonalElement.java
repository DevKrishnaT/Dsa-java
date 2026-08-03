package test;

public class DiagonalElement {
    static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.print("First:- ");
        int col = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][col--] + " ");
        }
        System.out.println();
        System.out.print("sec:- ");
        int row = 0;

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[row++][i] + " ");
        }
    }
}
