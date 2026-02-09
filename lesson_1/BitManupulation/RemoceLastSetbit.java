package lesson_1.BitManupulation;

public class RemoceLastSetbit {
    static void main(String[] args) {
        int n = 10;
        int ans = removeLastSetbit(n);
        System.out.println(ans);
    }

    private static int removeLastSetbit(int n) {
        return n & (n - 1);
    }
}
