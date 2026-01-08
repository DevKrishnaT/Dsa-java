package lesson_1.javabasic.recursion;

public class oneToN {
    public static void main(String[] args) {
        int n = 5;
        func(n);

    }

    public static void func(int N) {
        if (N == 0) return;
        System.out.print(N);
        func(N - 1);
    }
}
