package BitManupulation;

public class SetUnsetBit {
    static void main(String[] args) {
        int n = 15;
        int ans = SetBit(n);
        System.out.println(ans);
    }

    private static int SetBit(int n) {
        return n | (n + 1);
    }
}
