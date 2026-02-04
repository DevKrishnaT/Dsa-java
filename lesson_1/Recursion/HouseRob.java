package lesson_1.Recursion;

import java.util.Arrays;

public class HouseRob {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        int ans = rob(arr, 0);
        System.out.println(ans);
    }

    static int[] memo;

    private static int rob(int[] arr, int n) {
        memo = new int[arr.length];
        Arrays.fill(memo, -1);

        return calculate(arr, 0);

    }

    private static int calculate(int[] arr, int n) {
        if (n >= arr.length) return 0;

        if (memo[n] != -1) return memo[n];

        int take = arr[n] + calculate(arr, n + 2);
        int skip = calculate(arr, n + 1);

        memo[n] = Math.max(take, skip);

        return memo[n];

    }
}
