package questions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ValidSudoku {
    static void main(String[] args) {
        System.out.println(1 / 3);
        System.out.println(2 / 3);
        System.out.println(3 / 3);
        System.out.println(4 / 3);
        System.out.println(4 / 3);
        System.out.println(8 / 3);
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        boolean ans = isValid(board);
    }

    private static boolean isValid(char[][] board) {
        HashSet<Character>[] row = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] box = new HashSet[9];


        for (int i = 0; i < 9; i++) {
            row[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }


        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') continue;
                char curr = board[i][j];
                int boxIndex = (i / 3) * 3 + (j / 3);

                if (row[i].contains(curr) ||
                        cols[j].contains(curr) ||
                        box[boxIndex].contains(curr)) {
                    return false;
                }

                row[i].add(curr);
                cols[j].add(curr);
                box[boxIndex].add(curr);

            }
        }
        return true;
    }
}
