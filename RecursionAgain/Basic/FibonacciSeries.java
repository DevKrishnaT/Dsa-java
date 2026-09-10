package RecursionAgain.Basic;

public class FibonacciSeries {
    static void main(String[] args) {
        int ans = Fibonacci(7);
        System.out.println(ans);
    }

    private static int Fibonacci(int num) {
        if (num == 0 || num == 1) {
            return num;
        }

        return Fibonacci(num - 1) + Fibonacci(num - 2);
    }
}
