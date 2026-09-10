package RecursionAgain.Basic;

public class SumOfNNumbers {
    static void main(String[] args) {
        int ans = StartSumming(7, 0);
        System.out.println(ans);
    }

    private static int StartSumming(int n, int sum) {
        if (n == 0) {
            return sum;
        }


        return StartSumming(n - 1, sum + n);


    }
}
