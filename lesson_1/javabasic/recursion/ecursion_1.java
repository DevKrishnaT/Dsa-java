package lesson_1.javabasic.recursion;

public class ecursion_1 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumtilln(n));
    }

    public static int sumtilln(int n) {
        if (n == 1) return 1;
        return n + sumtilln(n - 1);
    }
}
