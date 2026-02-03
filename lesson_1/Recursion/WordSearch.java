package lesson_1.Recursion;

public class WordSearch {
    static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCED";
        boolean ans = exist(board, word);

    }

    private static boolean exist(char[][] board, String word) {
        int rows = board.length;
        int col = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (isValid(board, word, i, j, 0)) {
                    return true;
                }

            }

        }
        return false;
    }

    private static boolean isValid(char[][] board, String word, int rows, int col, int idx) {
        if (idx == word.length()) return true;

        if (rows < 0 || col < 0 || rows >= board.length || col >= board[0].length) {
            return false;
        }
        if (board[rows][col] != word.charAt(idx)) return false;

        char temp = board[rows][col];
        board[rows][col] = '#';


        boolean found = isValid(board, word, rows + 1, col, idx + 1) ||
                isValid(board, word, rows - 1, col, idx + 1) ||
                isValid(board, word, rows, col + 1, idx + 1) ||
                isValid(board, word, rows, col - 1, idx + 1);

        board[rows][col] = temp;

        return found;
    }
}
