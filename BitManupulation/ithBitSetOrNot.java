package BitManupulation;

public class ithBitSetOrNot {
    static void main(String[] args) {
        int num = 7;
        int i = 2;
        boolean ans = setIthBit(num, i);
        System.out.println(ans);
    }

    private static boolean setIthBit(int n, int i) {
        return (n & (1 << i)) != 0;
    }
}
