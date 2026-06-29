package Revision.Recursion;

public class goodNumbers {
    void main(String[] args) {
        long n = 5;
        int ans = countGoodNumbers(n);
        System.out.println(ans);
    }

    private long MOD = 1000000007;

    private int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = (n / 2);
        long first = pow(5, even) % MOD;
        long sec = pow(4, odd) % MOD;

        return (int) ((first * sec) % MOD);

    }

    private long pow(int x, long n) {
        if (n == 0) return 1;
        long half = pow(x, n / 2);

        if (n % 2 == 0) {
            return (half * half) % MOD;
        } else {
            return (((half * half) % MOD) * x) % MOD;
        }
    }
}
