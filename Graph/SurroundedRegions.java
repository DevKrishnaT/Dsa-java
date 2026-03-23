package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SurroundedRegions {
    static void main(String[] args) {
        char[][] board = {{'X', 'X', 'X', 'X' }, {'X', 'O', 'O', 'X' }, {'X', 'X', 'O', 'X' }, {'X', 'O', 'X', 'X' }};
        solve(board);
        for (char[] c : board) {
            System.out.println(Arrays.toString(c));
        }
    }

    private static void solve(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        Queue<int[]> queue = new LinkedList<>();


        for (int i = 0; i < rows; i++) {
            if (board[i][0] == 'O') queue.add(new int[]{i, 0});
            if (board[i][cols - 1] == 'O') queue.add(new int[]{i, cols - 1});
        }

        for (int j = 0; j < cols; j++) {
            if (board[0][j] == 'O') queue.add(new int[]{0, j});
            if (board[rows - 1][j] == 'O') queue.add(new int[]{rows - 1, j});
        }

        int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};


        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            int i = node[0];
            int j = node[1];

            if (i < 0 || j < 0 || i >= rows || j >= cols || board[i][j] != 'O') {
                continue;
            }

            board[i][j] = '#';

            for (int[] d : dir) {
                queue.add(new int[]{i + d[0], j + d[1]});
            }
        }


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == '#') {
                    board[i][j] = 'O';
                }
            }
        }
    }
}
