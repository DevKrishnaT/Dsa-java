package lesson_1.BitManupulation;

public class CheckKthBit {
    static void main(String[] args) {
        int n = 4;
        int k = 2;

        n = n >> k;
        String s = Integer.toBinaryString(n);

        if (s.charAt(s.length() - 1) == '1') {
            System.out.println(true);
            return;

        } else {
            System.out.println(false);
            return;
        }

    }
}
