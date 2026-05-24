package Dynamic_Programming;

public class ClimbingStairs {
    static void main(String[] args) {
        int n = 4;
        int ans = climbingStairs(n);
        System.out.println(ans);
    }

    private static int climbingStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int prev = 2;
        int prEV2 = 1;
        for (int i = 3; i <= n; i++) {
            int curr = prev + prEV2;
            prEV2 = prev;
            prev = curr;
        }
        return prev;
    }
}
