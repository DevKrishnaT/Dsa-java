package Revision.Recursion;

public class CountingFromback {
    static void main(String[] args) {
        int n = 10;
        printFromBack(n);
    }

    private static void printFromBack(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");
        ;
        printFromBack(n - 1);

    }
}
