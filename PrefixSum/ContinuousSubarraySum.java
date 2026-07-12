package PrefixSum;

import java.util.HashMap;

public class ContinuousSubarraySum {
    static void main(String[] args) {
        int[] nums = {6, 23, 23, 23, 23};
        int k = 6;
        boolean ans = checkSubarraySum(nums, k);
        System.out.println(ans);
    }

    private static boolean checkSubarraySum(int[] nums, int k) {
        int prefixSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int rem = prefixSum % k;
            if (map.containsKey(rem)) {
                if (i - map.get(rem) >= 2) {
                    return true;
                }
            } else {
                map.put(rem, i);
            }

        }
        return false;

    }
}
