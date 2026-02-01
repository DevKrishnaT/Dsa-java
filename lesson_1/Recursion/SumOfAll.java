package lesson_1.Recursion;

public class SumOfAll {
    static void main(String[] args) {
        int n = 5;
        int ans = RecursiveCall(0, n);
        int ans2 = recusive(n);
        System.out.println(ans);
        System.out.println(ans2);
    }

    private static int recusive(int n) {
        if (n == 0) {
            return 0;
        }

        return n + recusive(n - 1);
    }

    private static int RecursiveCall(int i, int n) {
        if (i == n) {
            return i;
        }
        return i + RecursiveCall(i + 1, n);
    }

}
