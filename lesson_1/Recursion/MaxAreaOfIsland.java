package lesson_1.Recursion;

public class MaxAreaOfIsland {
    static void main(String[] args) {
        int[][] grid = {{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0}, {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};

        int ans = maxAreaOfIsland(grid);
        System.out.println(ans);
    }

    private static int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int totalsum = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (grid[i][j] == 1) {
                    int sum = BackTrack(grid, i, j);
                    totalsum = Math.max(sum, totalsum);
                }

            }

        }
        return totalsum;
    }

    private static int BackTrack(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) {
            return 0;
        }

        grid[i][j] = 0;
        int area = 1;

        area += BackTrack(grid, i + 1, j);
        area += BackTrack(grid, i - 1, j);
        area += BackTrack(grid, i, j + 1);
        area += BackTrack(grid, i, j - 1);

        return area;
    }


}
