package lesson_1.ArraysQ;

import java.util.Arrays;

public class CanBeObtR {
    public static void main(String[] args) {
        int[][] mat = {{0, 1}, {1, 1}};
        int[][] target = {{1, 0}, {0, 1}};
        int n = mat.length;

        for (int k = 0; k < 4; k++) {

            if (isEqual(mat, target)) {
                System.out.println(true);
                return;
            }

            RotateMat(mat);
        }

        System.out.println(false);
    }

    private static boolean isEqual(int[][] a, int[][] b) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void RotateMat(int[][] mat) {
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = mat[i][j];

                mat[i][j] = mat[j][i];

                mat[j][i] = temp;

            }

        }

        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = mat.length - 1;
            while (left < right) {
                int temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;
                left++;
                right--;
            }

        }


    }
}

