package Graph.SortestPath;

import java.util.*;

public class SortestPathInMaze {
    static class pair {
        int row;
        int col;
        int distance;

        pair(int row, int col, int distance) {
            this.row = row;
            this.col = col;
            this.distance = distance;
        }
    }

    static void main(String[] args) {
        int[][] grid = {{0, 0, 0}, {1, 1, 0}, {1, 1, 0}};
        int ans = shortestPathBinaryMatrix(grid);
    }

    private static int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;

        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1) {
            return -1;

        }
       

        Queue<pair> q = new LinkedList<>();
        q.offer(new pair(0, 0, 1));

        grid[0][0] = 1;

        int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};
        while (!q.isEmpty()) {
            pair curr = q.poll();

            int r = curr.row;
            int c = curr.col;
            int dist = curr.distance;

            if (r == n - 1 && c == n - 1) {
                return dist;
            }
            for (int i = 0; i < 8; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if (nr >= 0 && nc >= 0 && nc < n && nr < n && grid[nr][nc] == 0) {
                    grid[nr][nc] = 1;

                    q.offer(new pair(nr, nc, dist + 1));
                }
            }

        }

        return -1;
    }
}
