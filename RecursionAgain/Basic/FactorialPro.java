package RecursionAgain.Basic;

public class FactorialPro {
    static void main(String[] args) {
        int n = 6;
        int ans = fac(n);
        System.out.println(ans);
    }

    private static int fac(int n) {
        if (n == 1) {
            return 1;
        }
       
        return n * fac(n - 1);
    }
}
