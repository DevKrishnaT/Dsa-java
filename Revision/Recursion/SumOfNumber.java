package Revision.Recursion;

public class SumOfNumber {
    static void main(String[] args) {
        int n = 10;
        int ans = sum(n);
        int formula = formaulaAns(n);
        System.out.println(ans);
        System.out.println(formula);
    }

    private static int formaulaAns(int n) {
        return n * (n + 1) / 2;
    }

    private static int sum(int n) {
        if (n == 0) {
            return 0;
        }

        return sum(n - 1) + n;
    }
}
