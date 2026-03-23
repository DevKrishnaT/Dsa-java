package Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class UpdateMatrix {
    static void main(String[] args) {
        int[][] matrix = {{0, 1, 1}, {1, 1, 1}, {1, 1, 0}};
//        int[][] upMat = updateMatrix(matrix);
        int[][] upMat = updateMatrix2(matrix);
        for (int[] num : upMat) {
            System.out.println(Arrays.toString(num));
        }
    }

    private static int[][] updateMatrix2(int[][] matrix) {
        Queue<int[]> queue = new LinkedList<>();

        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    queue.add(new int[]{i, j});
                } else {
                    matrix[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        int[][] dir = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int i = curr[0];
            int j = curr[1];
            for (int[] d : dir) {
                int ni = d[0] + i;
                int nj = d[1] + j;
                if (ni >= 0 && nj >= 0 && ni < row && nj < col) {
                    if (matrix[ni][nj] > matrix[i][j]) {
                        matrix[ni][nj] = matrix[i][j] + 1;
                        queue.add(new int[]{ni, nj});
                    }
                }
            }
        }
        return matrix;
    }

    private static int[][] updateMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        int[][] dir = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};
        boolean[][] visited = new boolean[rows][cols];
        visited[0][0] = true;
        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            int i = node[0];
            int j = node[1];
            int minNighbur = Integer.MAX_VALUE;
            for (int[] d : dir) {
                int ni = d[0] + i;
                int nj = d[1] + j;
                if (ni >= 0 && nj >= 0 && ni < rows && nj < cols) {
                    if (!visited[ni][nj]) {
                        queue.add(new int[]{ni, nj});
                        visited[ni][nj] = true;
                    }
                    minNighbur = Math.min(minNighbur, matrix[ni][nj]);
                }
            }
            if (matrix[i][j] != 0) {
                matrix[i][j] = minNighbur + 1;
            }


        }
        return matrix;
    }

}
