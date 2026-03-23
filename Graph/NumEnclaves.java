package Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class NumEnclaves {
    static void main(String[] args) {
        int[][] grid = {{0, 0, 0, 0}, {1, 0, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}};
        int ans = numEnclaves(grid);
        System.out.println(ans);
    }

    private static int numEnclaves(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < rows; i++) {
            if (grid[i][0] == 1) {
                queue.add(new int[]{i, 0});
            }
            if (grid[i][cols - 1] == 1) {
                queue.add(new int[]{i, cols - 1});
            }
        }
        for (int i = 0; i < cols; i++) {
            if (grid[0][i] == 1) {
                queue.add(new int[]{0, i});
            }
            if (grid[rows - 1][i] == 1) {
                queue.add(new int[]{rows - 1, i});
            }
        }
        int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int i = curr[0];
            int j = curr[1];

            if (i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] == 0) {
                continue;
            }
            grid[i][j] = 0;
            for (int[] d : dir) {
                queue.add(new int[]{i + d[0], j + d[1]});
            }


        }
        int num = 0;

        for (int[] ints : grid) {
            for (int j = 0; j < cols; j++) {
                if (ints[j] == 1) {
                    num++;
                }
            }
        }

        return num;
    }
}
