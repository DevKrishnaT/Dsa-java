package RecursionAgain.Basic;

public class ForwordCounting {
    static void main(String[] args) {
        startPrinting(7);
    }

    private static void startPrinting(int n) {
        if (n == 0) {
            return;
        }


        startPrinting(n - 1);
        System.out.print(n + " ");
    }
}
