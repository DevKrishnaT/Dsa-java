package lesson_1.BitManupulation;

public class ClearIth {
    static void main(String[] args) {
        int n = 7;
        int i = 2;
        int ans = clearIth(n, i);
        System.out.println(ans);
    }

    private static int clearIth(int n, int i) {
        return (n & ~(1 << i));
    }
}
