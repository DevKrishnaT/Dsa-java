package RecursionAgain.RealQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueenAgain {
    static void main(String[] args) {
        int n = 4;
        List<List<String>> ans = solveNQueens(n);
        System.out.println(ans);
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> list = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] curr : board) {
            Arrays.fill(curr, '.');
        }

        placeQueen(list, board, 0);
        return list;
    }

    private static void placeQueen(List<List<String>> list, char[][] board, int row) {
        if (row == board.length) {
            list.add(new ArrayList<>(consturct(board)));
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isValid(board, row, col)) {
                board[row][col] = 'Q';
                placeQueen(list, board, row + 1);
                board[row][col] = '.';
            }
            ;
        }
    }

    private static boolean isValid(char[][] board, int row, int col) {
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = col + 1, j = row - 1; i < board.length && j >= 0; i++, j--) {
            if (board[j][i] == 'Q') {
                return false;
            }
        }


        return true;
    }

    private static List<String> consturct(char[][] board) {
        List<String> list = new ArrayList<>();
        for (char[] curr : board) {
            list.add(new String(curr));
        }
        return list;
    }
}
