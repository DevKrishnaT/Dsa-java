package BitManupulation;

public class Modulo {
    static void main(String[] args) {
        int n = 10;
        int k = 2;
        int ans = modulo(n, k);
        System.out.println(ans);
    }

    private static int modulo(int n, int k) {
        return n & ((1 << k) - 1);
    }
}
