package test;

import java.math.BigInteger;
import java.util.Arrays;

public class ConstructProductMatrix {
    static void main(String[] args) {
        int[][] grid = {{1, 2}, {3, 4}};
        int[][] ans = constructProductMatrix(grid);
        

        for (int[] num : ans) {
            System.out.println(Arrays.toString(num));
        }
    }

    private static int[][] constructProductMatrix(int[][] grid) {
        long multiple = 1;
        int module = 12345;
        int rows = grid.length;
        int cols = grid[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int CurrNo = grid[i][j];
                multiple *= CurrNo;

            }
        }
        int[][] ansGrid = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                long num = (multiple / grid[i][j]);
                int moduleNum = Math.toIntExact(num % module);
                ansGrid[i][j] = moduleNum;
            }
        }

        return ansGrid;
    }
}
