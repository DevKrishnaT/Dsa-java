package PrefixSum;

import java.util.HashMap;

public class continous {
    static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int target = 2;
        int ans = find(nums, target);
        System.out.println(ans);
    }

    private static int find(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefix = 0;
        int count = 0;
        map.put(0, 1);
        for (int num : nums) {
            prefix += num;
            if (map.containsKey(prefix - target)) {
                count += map.get(prefix - target);
            }
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
        return count;
    }
}
