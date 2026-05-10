package Graph.SortestPath;

import java.util.Arrays;
import java.util.PriorityQueue;

public class minimumEffortPath {
    static class Pair {
        int row;
        int col;
        int efforts;

        Pair(int row, int col, int efforts) {
            this.row = row;
            this.col = col;
            this.efforts = efforts;
        }
    }

    static void main(String[] args) {
        int[][] grid = {{1, 2, 2}, {3, 8, 2}, {5, 3, 5}};
        int ans = shortestPath(grid);
        System.out.println(ans);
    }

    private static int shortestPath(int[][] grid) {

        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> x.efforts - y.efforts);
        int n = grid.length;
        int m = grid[0].length;


        int[][] dist = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], (int) 1e9);
        }
        dist[0][0] = 0;
        pq.offer(new Pair(0, 0, 0));


        int[] dc = {-1, 1, 0, 0};
        int[] dr = {0, 0, -1, 1};


        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            int r = curr.row;
            int c = curr.col;
            int efforts = curr.efforts;


            if (r == n - 1 && c == m - 1) {
                return efforts;
            }
            for (int i = 0; i < 4; i++) {
                int nc = c + dc[i];
                int nr = r + dr[i];

                if (nr >= 0 && nc >= 0 && nc < n && nr < m) {
                    int newEffort = Math.max(efforts, Math.abs(grid[nr][nc] - grid[r][c]));
                    if (newEffort < dist[nr][nc]) {

                        dist[nr][nc] = newEffort;

                        pq.offer(new Pair(nr, nc, newEffort));
                    }
                }

            }
        }
        return 0;
    }
}
