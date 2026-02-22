package Recursion;

public class CountGoodNumbers {
    private static long MOD = 1000000007;

    static void main() {
        long n = 4;
        int i = countGoodNumbers(n);
        System.out.println(i);

    }

    private static int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;
        long first = pow(5, even) % MOD;
        long sec = pow(4, odd) % MOD;

        return (int) ((first * sec) % MOD);

    }

    private static long pow(long i, long n) {
        if (n == 0) return 1;

        long half = pow(i, n / 2);

        if (n % 2 == 0) {
            return (half * half) % MOD;
        } else {
            return (i * half * half) % MOD;
        }
    }
}
