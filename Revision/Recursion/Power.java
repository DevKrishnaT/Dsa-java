package Revision.Recursion;

public class Power {
    static void main(String[] args) {
        int x = 10;
        int n = 3;
        long ans = pow(x, n);
        System.out.println(ans);
    }

    private static long pow(int x, int n) {
        if (n == 0) {
            return 1;
        }

        return pow(x, n - 1) * x;
    }


}
