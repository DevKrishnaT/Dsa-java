package lesson_1.BinarySearch.BsTwoDArr;

import java.util.Arrays;

public class maxOne {
    public static void main(String[] args) {
        int[][] arr = {{0, 0, 0}, {0, 1, 1}};
        int[] ans = rowWithMax1s(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] rowWithMax1s(int[][] arr) {

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
}
