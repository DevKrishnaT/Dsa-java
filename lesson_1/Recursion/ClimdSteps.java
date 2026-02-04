package lesson_1.Recursion;

public class ClimdSteps {
    static void main(String[] args) {
        int n = 4;
        int ans = climdSteps(n);
        System.out.println(ans);
    }


    private static int climdSteps(int n) {
        if (n == 0) return 1;
        if (n < 0) return 0;

        return climdSteps(n - 1) + climdSteps(n - 2);
    }
}
