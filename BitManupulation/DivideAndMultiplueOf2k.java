package BitManupulation;

public class DivideAndMultiplueOf2k {
    static void main(String[] args) {
        int n = 10;
        int k = 2;
        int ans = fucn(n, k);
        System.out.println(ans);
    }

    private static int fucn(int n, int k) {
        int devide = n >> k;
        int multilye = n << k;
        return multilye;
    }


}
