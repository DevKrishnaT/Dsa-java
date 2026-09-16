package test;

public class NumberOfIsland {
    static void main(String[] args) {
        char[][] grid = {{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}};
        int ans = numIsLand(grid);
    }

    private static int numIsLand(char[][] grid) {
        int count = 0;
        int row = grid.length;
        int col = grid[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1') {
                    makeItWater(i, j, grid);
                    count++;
                }
            }
        }

        return count;
    }

    private static void makeItWater(int i, int j, char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        if (i < 0 || j < 0 || i >= row || j >= col || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';

        makeItWater(i + 1, j, grid);
        makeItWater(i - 1, j, grid);
        makeItWater(i, j + 1, grid);
        makeItWater(i, j - 1, grid);
    }

}
