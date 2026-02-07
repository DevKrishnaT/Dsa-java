package lesson_1.BitManupulation;

public class PowerOftwo {
    static void main(String[] args) {
        int x = 0;
        boolean ans = isPowerOfTwo(x);
        System.out.println(ans);
    }

    private static boolean isPowerOfTwo(int n) {

        return n > 0 && (n & (n - 1)) == 0;

    }
}
