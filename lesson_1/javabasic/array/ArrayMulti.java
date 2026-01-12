package lesson_1.javabasic.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayMulti {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    map.put(j, i);

                }
            }


        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            makeZero(matrix, e.getKey(), e.getValue());
        }


    }

    public static void makeZero(int[][] matrix, int i, int j) {

        for (int p = 0; p < matrix.length; p++) {
            matrix[j][p] = 0;
        }

        for (int k = 0; k < matrix.length; k++) {
            matrix[k][i] = 0;
        }
    }

}
