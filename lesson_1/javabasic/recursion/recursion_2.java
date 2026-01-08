package lesson_1.javabasic.recursion;

public class recursion_2 {
    public static void main(String[] args) {
        name(5);
    }

    public static void name(int n) {
        if (n == 0) return;

        System.out.print("krishna ");

        name(n - 1);

    }

    ;
}
