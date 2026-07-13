package PrefixSum;

import java.util.HashMap;

public class SubarraysDivByK {
    static void main(String[] args) {
        int[] nums = {-1, 2, 9};
        int k = 2;
        int ans = subarraysDivByK(nums, k);
        System.out.println(ans);
    }

    private static int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefix = 0;
        int count = 0;
        map.put(0, 1);
        for (int num : nums) {
            prefix += num;
            int curr = (((prefix % k) + k) % k);
            if (map.containsKey(curr)) {
                count += map.get(curr);
            }

            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }
        return count;

    }
}
