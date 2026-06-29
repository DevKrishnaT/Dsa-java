package Revision.Recursion;

public class CLimbStairsTabular {
    static void main(String[] args) {
        int n = 10;
        int ans = ClimbIt(n);
        System.out.println(ans);
    }

    private static int ClimbIt(int n) {


        int prev2 = 1;
        int prev1 = 1;
        for (int i = 2; i <= n; i++) {

            int curr = prev1 + prev2;

            prev2 = prev1;
            prev1 = curr;


        }
        return prev1;


    }
}
