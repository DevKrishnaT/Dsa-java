package questions;

import java.util.ArrayList;
import java.util.Arrays;

public class CandieDistribution {
    static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10, 2, 4, 2, 6, 1, 7, 8, 9, 2));
        int n = arr.size();
        long ans = solve(n, arr);
        System.out.println(ans);
    }

    private static long solve(int n, ArrayList<Integer> arr) {

        int[] candies = new int[n];
        Arrays.fill(candies, 1);

        for (int i = 1; i < n; i++) {
            if (arr.get(i) > arr.get(i - 1)) {
                candies[i] = candies[i - 1] + 1;
            }
        }


        for (int i = n - 2; i >= 0; i--) {
            if (arr.get(i) > arr.get(i + 1)) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }


        int sum = 0;
        for (int i : candies) {
            sum += i;
        }

        return sum;

    }
}
