package Revision.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueen {
    static void main(String[] args) {
        int n = 10;
        List<List<String>> ans = solveNQueens(n);
        System.out.println(ans);
    }

    private static List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] crr : board) {
            Arrays.fill(crr, '.');
        }
        backtrack(0, board, ans);
        return ans;
    }

    private static void backtrack(int row, char[][] board, List<List<String>> ans) {
        if (row == board.length) {
            ans.add(construct(board, ans));
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isSafe(col, row, board)) {
                board[row][col] = 'Q';
                backtrack(row + 1, board, ans);
                board[row][col] = '.';
            }
        }
    }

    private static List<String> construct(char[][] board, List<List<String>> ans) {
        List<String> oneRow = new ArrayList<>();
        for (char[] curr : board) {
            oneRow.add(new String(curr));
        }
        return oneRow;

    }

    private static boolean isSafe(int col, int row, char[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') return false;
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }
}
