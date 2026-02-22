package Recursion;

import java.util.ArrayList;

public class RatInMaze {
    static void main(String[] args) {
        int[][] maze = {{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}};
        ArrayList<String> ans = new ArrayList<>();
        ratInMaze(maze, ans);
        System.out.println(ans);
    }

    private static void ratInMaze(int[][] maze, ArrayList<String> ans) {


        Validate(0, 0, maze, ans, new StringBuilder());

    }

    private static void Validate(int rows, int col, int[][] maze, ArrayList<String> ans, StringBuilder Curr) {


        if (rows < 0 || col < 0 || rows >= maze.length || col >= maze[0].length || maze[rows][col] == 0) {
            return;
        }
        if (rows == maze.length - 1 && col == maze.length - 1) {
            ans.add(Curr.toString());
            return;
        }


        maze[rows][col] = 0;
        Curr.append("D");
        Validate(rows + 1, col, maze, ans, Curr);
        Curr.deleteCharAt(Curr.length() - 1);
        Curr.append("L");
        Validate(rows, col - 1, maze, ans, Curr);
        Curr.deleteCharAt(Curr.length() - 1);

        Curr.append("R");
        Validate(rows, col + 1, maze, ans, Curr);
        Curr.deleteCharAt(Curr.length() - 1);


        Curr.append("U");
        Validate(rows - 1, col, maze, ans, Curr);
        Curr.deleteCharAt(Curr.length() - 1);


        maze[rows][col] = 1;


    }


}
