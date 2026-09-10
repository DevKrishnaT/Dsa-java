package RecursionAgain.Basic;

public class PrintNumbers {
    static void main(String[] args) {
        startPrinting(7);
    }

    private static void startPrinting(int n) {
        if (n == 0) {
            System.out.println();
            return;
        }
        System.out.print("before:- " + n + " ");
        startPrinting(n - 1);
        System.out.print("After:- " + n + " ");
    }
}
