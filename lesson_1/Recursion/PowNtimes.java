package lesson_1.Recursion;

public class PowNtimes {
    static void main(String[] args) {
        double x = 2;
        int n = 10;
        double ans = pow(x, n);

        System.out.println(ans);
    }

    public static double pow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        return fast(x, N);

    }

    private static double fast(double x, long n) {
        if (n == 0) return 1.0;

        double half = fast(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}
