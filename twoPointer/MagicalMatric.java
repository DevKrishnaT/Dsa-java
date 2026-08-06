package twoPointer;

public class MagicalMatric {
    static void main(String[] args) {
        int[][] matrix = {{5, 3, 4}, {1, 5, 8}, {6, 4, 2}};
        int ans = formingMagicSquare(matrix);
        System.out.println(ans);
    }

    private static int formingMagicSquare(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int count = 0;

        for (int i = 0; i <= rows - 3; i++) {
            for (int j = 0; j <= cols - 3; j++) {
                if (isMagic(grid, i, j)) {
                    count++;
                }
            }
        }

        return count;
    }

    private static boolean isMagic(int[][] grid, int r, int c) {

        boolean[] seen = new boolean[10];


        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {

                int num = grid[i][j];

                if (num < 1 || num > 9 || seen[num]) {
                    return false;
                }

                seen[num] = true;
            }
        }


        for (int i = r; i < r + 3; i++) {
            if (grid[i][c] + grid[i][c + 1] + grid[i][c + 2] != 15)
                return false;
        }


        for (int j = c; j < c + 3; j++) {
            if (grid[r][j] + grid[r + 1][j] + grid[r + 2][j] != 15)
                return false;
        }


        if (grid[r][c] + grid[r + 1][c + 1] + grid[r + 2][c + 2] != 15)
            return false;

        if (grid[r][c + 2] + grid[r + 1][c + 1] + grid[r + 2][c] != 15)
            return false;

        return true;

    }
}
