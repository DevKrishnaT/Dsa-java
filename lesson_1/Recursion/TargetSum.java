package lesson_1.Recursion;

import java.util.HashMap;

public class TargetSum {
    static HashMap<String, Integer> memo = new HashMap<>();

    static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1};
        int exp = 3;
        int ans = targetSum(0, exp, 0, arr);
        System.out.println(ans);

    }

    private static int targetSum(int idx, int target, int sum, int[] arr) {
        if (idx == arr.length) {
            if (sum == target) {
                return 1;
            }
            return 0;
        }
        String key = idx + "yoyo" + sum;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int postive = targetSum(idx + 1, target, sum + arr[idx], arr);
        int negative = targetSum(idx + 1, target, sum - arr[idx], arr);

        memo.put(key, postive + negative);
        return memo.get(key);
    }
}
