package RecursionAgain.Basic.Basic;

public class Fibonacci {
    static void main(String[] args) {
        int n = 2;
        int ans = fibonacci(n);
        System.out.println(ans);
        boolean primeornot = isPrime(n, 1);
        System.out.println(primeornot);
    }

    private static boolean isPrime(int n, int i) {
        if (n < 2) {
            return false;
        }
        if (i * i > n) {
            return true;
        }

        if (n % i == 0) {
            return false;
        }

        return isPrime(n, i + 1);

    }

    private static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
