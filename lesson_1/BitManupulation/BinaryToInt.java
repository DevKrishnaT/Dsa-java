package lesson_1.BitManupulation;

public class BinaryToInt {
    static void main(String[] args) {
        int t = 1101111111;
        System.out.println(binaryToInt(t));

    }

    static int binaryToInt(int n) {
        if (n == 0) {
            return 0;
        }

        return binaryToInt(n / 10) * 2 + (n % 10);
    }
}
