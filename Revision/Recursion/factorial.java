package Revision.Recursion;

public class factorial {
    static void main(String[] args) {
        int n = 10;
        int ans = Factorial(n);
        System.out.println(ans);
    }

    private static int Factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return Factorial(n - 1) * n;
    }
}
