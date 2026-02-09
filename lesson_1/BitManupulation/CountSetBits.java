package lesson_1.BitManupulation;

public class CountSetBits {
    static void main(String[] args) {
        int n = 10;
        int ans = countSetBits(n);
        int ans2 = countSetBits2(n);
        System.out.println(ans);
        System.out.println(ans2);

    }

    private static int countSetBits2(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;

        }
        return count;
    }

    private static int countSetBits(int n) {
        int count = 0;
        while (n > 1) {
            count += n & 1;
            n = n >> 1;
        }
        if (n == 1) count += 1;

        return count;
    }
}
