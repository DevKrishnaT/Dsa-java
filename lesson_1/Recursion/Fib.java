package lesson_1.Recursion;

public class Fib {
    static void main(String[] args) {
        int n = 6;
        int ans = fib(0, 1, n);
        System.out.println(ans);
    }

    private static int fib(int prev, int curr, int n) {
        if (n == 1) return curr;

        return fib(curr, curr + prev, n - 1);
    }
}
