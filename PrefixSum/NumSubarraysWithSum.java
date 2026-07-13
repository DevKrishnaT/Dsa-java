package PrefixSum;

import java.util.HashMap;

public class NumSubarraysWithSum {
    static void main(String[] args) {
        int[] nums = {0, 0, 0, 0, 0};
        int goal = 0;
        int ans = numSubarraysWithSum(nums, goal);
        System.out.println(ans);
    }

    private static int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefix = 0;
        map.put(0, 1);
        int count = 0;
        for (int num : nums) {
            prefix += num;
            if (map.containsKey(prefix - goal)) {
                count += map.get(prefix - goal);
            }
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }

        return count;
    }
}
