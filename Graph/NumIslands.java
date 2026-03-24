package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class NumIslands {
    static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        int numOfIland = numIslands(grid);
        System.out.println(numOfIland);
    }

    private static int numIslands(char[][] grid) {
        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {

//                    makeItWater(grid, i, j);
                    makeItWaterII(grid, i, j);
                    count++;
                }
            }

        }
        return count;
    }

    private static void makeItWaterII(char[][] grid, int i, int j) {
        int rows = grid.length;
        int cols = grid[0].length;
        if (i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        ;
        makeItWaterII(grid, i - 1, j);
        makeItWaterII(grid, i + 1, j);
        makeItWaterII(grid, i, j - 1);
        makeItWaterII(grid, i, j + 1);
    }


    private static void makeItWater(char[][] grid, int i, int j) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i, j});
        int[][] dirs = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int Index_i = curr[0];
            int Index_j = curr[1];

            for (int[] c : dirs) {
                int newi = Index_i + c[0];
                int newj = Index_j + c[1];
                if (newi >= 0 && newj >= 0 && newi < rows && newj < cols && grid[newi][newj] == '1') {
                    grid[newi][newj] = '0';
                    queue.add(new int[]{newi, newj});
                }
            }
        }
    }
}