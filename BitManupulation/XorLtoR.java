package BitManupulation;

public class XorLtoR {
    static void main(String[] args) {
        int l = 10;
        int r = 30;
        int ans = findXor(l, r);
        System.out.println(ans);
    }

    private static int findXor(int l, int r) {
        return xor(r) ^ xor(l - 1);
    }

    private static int xor(int n) {
        if (n < 0) return 0;

        return switch (n % 4) {
            case 0 -> n;
            case 1 -> 1;
            case 2 -> n + 1;
            default -> 0;
        };
    }
}
