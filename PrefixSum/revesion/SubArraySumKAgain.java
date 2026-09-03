package PrefixSum.revesion;

import java.util.HashMap;

public class SubArraySumKAgain {
    static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int ans = sum(nums, 3);
    }

    public static int sum(int[] nums, int k) {
        int totalSum = 0;
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
            if (map.containsKey(totalSum - k)) {
                ans += map.get(totalSum - k);
            }

            map.put(totalSum, map.getOrDefault(totalSum, 0) + 1);
        }

        return ans;
    }
}
