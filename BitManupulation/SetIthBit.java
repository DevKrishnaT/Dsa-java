package BitManupulation;

public class SetIthBit {
    static void main(String[] args) {
        int n = 10;
        int i = 2;
        int ans = setIthBit(n, i);
        System.out.println(ans);
    }

    private static int setIthBit(int n, int i) {
        return (n | (1 << i));
    }
}
