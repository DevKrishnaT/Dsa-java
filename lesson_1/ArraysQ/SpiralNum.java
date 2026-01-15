package lesson_1.ArraysQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralNum {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {1, 2, 3}};
        List<Integer> list = new ArrayList<>();
        int rows = matrix.length;
        int col = matrix[0].length;
        int top = 0, bottom = rows - 1;
        int right = col - 1, left = 0;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            for (int i = top + 1; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            for (int i = right - 1; i >= left; i--) {
                if (top == bottom) {
                    break;

                }
                list.add(matrix[bottom][i]);
            }
            for (int i = bottom - 1; i > top; i--) {
                if (left == right) {
                    break;
                }
                list.add(matrix[i][left]);
            }


            top++;
            bottom--;
            left++;
            right--;
        }
        System.out.println(list);
    }
}
