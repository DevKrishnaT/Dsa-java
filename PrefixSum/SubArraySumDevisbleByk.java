package PrefixSum;

import java.util.HashMap;

public class SubArraySumDevisbleByk {
    static void main(String[] args) {
        int[] nums = {-1, 2, 9};
        int k = 2;
        int ans = subarraysDivByK(nums, k);
        System.out.println(ans);
    }

    private static int subarraysDivByK(int[] nums, int k) {
        int prefixSum = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int num : nums) {
            prefixSum += num;
            int rem = Math.abs(prefixSum % k);
            if (map.containsKey(rem)) {
                count += map.get(rem);
            }
            map.put(rem, map.getOrDefault(rem, 0) + 1);

        }
        return count;
    }
}
