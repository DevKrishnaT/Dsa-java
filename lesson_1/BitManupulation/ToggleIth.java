package lesson_1.BitManupulation;

public class ToggleIth {
    static void main(String[] args) {
        int n = 14;
        int i = 2;
        int ans = toggleith(n, i);
        System.out.println(ans);

    }

    private static int toggleith(int n, int i) {
        return n ^ (1 << i);
    }
}
