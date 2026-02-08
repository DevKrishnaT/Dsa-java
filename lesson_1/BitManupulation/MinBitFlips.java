package lesson_1.BitManupulation;

public class MinBitFlips {
    static void main(String[] args) {
        int start = 5;
        int goal = 3;
        int ans = minBitFlips(start, goal);
        System.out.println(ans);
    }

    private static int minBitFlips(int start, int goal) {
        int ans = start ^ goal;

        int count = 0;
        while (ans != 0) {
            ans = ans & (ans - 1);
            count++;
        }
        return count;
    }
}
