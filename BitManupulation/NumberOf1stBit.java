package BitManupulation;

public class NumberOf1stBit {
    static void main(String[] args) {
        int n = 1111110;
        int ans = count(n);
    }

    private static int count(int n) {
        int count = 0;

        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}
