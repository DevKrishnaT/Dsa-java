package Revision.Recursion;

public class myPow {
    static void main(String[] args) {
        double x = 2.0000;
        int n = -2;

        double ans = mypow(x, n);
        System.out.println(ans);
    }

    private static double mypow(double x, int n) {
        long power = n;

        if (power < 0) {
            x = 1 / x;
            
            power = -power;
        }

        return solve(x, power);
    }

    private static double solve(double x, long n) {
        if (n == 0) return 1;

        double half = solve(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        }

        return half * half * x;
    }
}
