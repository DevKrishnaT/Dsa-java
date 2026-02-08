package lesson_1.BitManupulation;

public class DivideTwoInt {
    static void main(String[] args) {
        int b = 15;
        int a = 30;
        int ans = divide(a, b);
        System.out.println(ans);
    }

    private static int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean negative = (dividend < 0) ^ (divisor < 0);

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);


        int result = 0;

        while (a >= b) {
            long temp = b;
            int multiple = 1;

            while (a >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            a -= temp;
            result += multiple;
        }
        return negative ? -result : result;
    }
}
