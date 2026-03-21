package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class OrangesRotting {
    static void main(String[] args) {

        int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        int ans = orangesRotting(grid);
        System.out.println(ans);
    }

    private static int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    q.add(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        int[][] dirs = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
        int time = 0;

        while (!q.isEmpty() && fresh > 0) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int[] curr = q.poll();
                for (int[] dir : dirs) {
                    int ni = curr[0] + dir[0];
                    int nj = curr[1] + dir[1];
                    if (ni >= 0 && nj >= 0 && ni < rows && nj < cols && grid[ni][nj] == 1) {
                        grid[ni][nj] = 2;
                        fresh--;
                        q.add(new int[]{ni, nj});

                    }
                }
            }
            time++;
        }
        return fresh == 0 ? time : -1;
    }
}
