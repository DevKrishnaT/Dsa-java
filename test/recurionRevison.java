package test;

public class recurionRevison {
    static void main(String[] args) {
        int n = 6;
        int ans = fibonachi(n);
        System.out.println(ans);
    }

    private static int fibonachi(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonachi(n - 1) + fibonachi(n - 2);
    }
}
