package questions;

public class JudgeCircle {
    static void main(String[] args) {
        String moves = "UD";
        boolean ans = judgeCircle(moves);
        System.out.println(ans);
    }

    private static boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'U') y++;
            if (c == 'D') y--;
            if (c == 'L') x++;
            if (c == 'R') x--;
        }

        return x == 0 && y == 0;
    }

}
