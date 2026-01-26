package lesson_1.BinarySearch.BsTwoDArr;

import java.util.Arrays;

public class FindPeakII {
    public static void main(String[] args) {
        int[][] arr = {{10, 20, 15}, {21, 30, 14}, {7, 16, 32}};
        int[] ans = findPeakGrid(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] findPeakGrid(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int top = 0;
        int bottom = m - 1;
        while (top <= bottom) {
            int mid = top + (bottom - top) / 2;
            int maxRow = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i][mid] > arr[maxRow][mid]) {
                    maxRow = i;
                }
                ;
            }

            int current = arr[maxRow][mid];
            int left = (mid - 1 >= 0) ? arr[maxRow][mid - 1] : -1;
            int right = (mid + 1 < m) ? arr[maxRow][mid + 1] : -1;


            if (current > left && current > right) {
                return new int[]{maxRow, mid};
            } else if (right > current) {
                top = mid + 1;
            } else {
                bottom = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
}
