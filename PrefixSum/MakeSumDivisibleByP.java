package PrefixSum;

import java.util.HashMap;

public class MakeSumDivisibleByP {
    static void main(String[] args) {
        int[] nums = {3, 1, 4, 2};
        int p = 6;
        int ans = minSubarray(nums, p);
        System.out.println(ans);
    }

    private static int minSubarray(int[] nums, int p) {
        long total = 0;
        for (int num : nums) {
            total += num;
        }

        int needed = (int) total % p;

        if (needed == 0) {
            return 0;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        int ans = nums.length;
        int prefix = 0;
        for (int i = 0; i < nums.length; i++) {
            prefix = (prefix + nums[i]) % p;
            int target = (prefix - needed + p) % p;
            if (map.containsKey(target)) {
                ans = Math.min(ans, i - map.get(target));
            }

            map.put(prefix, i);
        }

        return ans == nums.length ? -1 : ans;
    }
}
