package lesson_1.questions.basic_q.BasicMathsq;

public class palidrom {
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int reversedHalf = 0;

        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        return x == reversedHalf || x == reversedHalf / 10;

    }

    ;

    public static void main(String[] args) {
        int x = 1221;
        System.out.println(isPalindrome(x));
    }
}
