package Graph.SortestPath;

import java.util.*;

public class RisingWater {
    static class Pair {
        int time;
        int row;
        int col;

        Pair(int time, int row, int col) {
            this.time = time;
            this.row = row;
            this.col = col;
        }
    }

    static class Pair2 {
        int row;
        int col;

        Pair2(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    static void main(String[] args) {

        int[][] grid = {{0, 1, 2, 3, 4}, {24, 23, 22, 21, 5}, {12, 13, 14, 15, 16}, {11, 17, 18, 19, 20}, {10, 9, 8, 7, 6}};
        int ans = swimInWater(grid);
        System.out.println(ans);
    }

    private static int swimInWater(int[][] grid) {
        int n = grid.length;
        boolean[][] visited = new boolean[n][n];
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.time - b.time);
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        pq.offer(new Pair(grid[0][0], 0, 0));
        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            int time = curr.time;
            int row = curr.row;
            int col = curr.col;

            if (visited[row][col]) {
                continue;
            }

            visited[row][col] = true;

            if (row == n - 1 && col == n - 1) {
                return time;
            }

            for (int[] dir : dirs) {
                int nr = row + dir[0];
                int nc = col + dir[1];

                if (nr >= 0 && nr < n && nc >= 0 && nc < n && !visited[nr][nc]) {
                    int newTime = Math.max(time, grid[nr][nc]);
                    pq.offer(new Pair(newTime, nr, nc));
                }
            }
        }
        return -1;
    }
}
