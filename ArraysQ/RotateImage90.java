package ArraysQ;

import java.util.Arrays;

public class RotateImage90 {
    static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(matrix);
    }

    private static void rotate(int[][] matrix) {
        int n = matrix.length;
        reverse(matrix, 0, n - 1);

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i == j) {
                    continue;
                }
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }

        }
        for (int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }
    }

    private static void reverse(int[][] matrix, int left, int right) {
        int[] temp;
        while (left < right) {
            temp = matrix[left];
            matrix[left] = matrix[right];
            matrix[right] = temp;
            left++;
            right--;
        }
    }
}
