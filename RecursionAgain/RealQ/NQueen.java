package RecursionAgain.RealQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueen {
    static void main(String[] args) {
        int n = 4;
        List<List<String>> ans = solveNQueens(n);
        System.out.println(ans);
    }

    private static List<List<String>> solveNQueens(int n) {
        List<List<String>> list = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] curr : board) {
            Arrays.fill(curr, '.');
        }
        placeQueens(list, board, 0);
        return list;
    }

    private static void placeQueens(List<List<String>> list, char[][] board, int rows) {
        if (rows == board.length) {
            list.add(new ArrayList<>(construct(board)));
            return;
        }


        for (int cols = 0; cols < board.length; cols++) {
            if (isSafe(board, rows, cols)) {
                board[rows][cols] = 'Q';
                placeQueens(list, board, rows + 1);
                board[rows][cols] = '.';
            }

        }

    }

    private static boolean isSafe(char[][] board, int rows, int cols) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][cols] == 'Q') return false;
        }

        for (int i = rows - 1, j = cols - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        for (int i = rows - 1, j = cols + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;


    }

    private static List<String> construct(char[][] board) {
        List<String> list = new ArrayList<>();

        for (char[] curr : board) {
            list.add(new String(curr));
        }

        return list;
    }


}
