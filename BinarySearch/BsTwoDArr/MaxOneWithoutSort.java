package BinarySearch.BsTwoDArr;

import java.util.Arrays;

public class MaxOneWithoutSort {
    public static void main(String[] args) {
        int[][] arr = {{0, 1}, {1, 0}};
        int[] ans = rowAndMaximumOnes(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] rowAndMaximumOnes(int[][] arr) {
        sort2d(arr);

        int ansRow = 0;
        int ans = 0;
        int colLength = arr[0].length - 1;
        for (int i = 0; i < arr.length; i++) {
            int left = 0;
            int right = colLength;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[i][mid] == 1) {
                    if (ans < (colLength + 1) - mid) {
                        ans = (colLength + 1) - mid;
                        ansRow = i;
                    }
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

        }
        int[] ansArr = {ansRow, ans};
        return ansArr;
    }


    public static void sort2d(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }
    }
}
