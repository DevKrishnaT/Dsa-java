package test;

import java.util.Arrays;
import java.util.HashMap;

public class Twosum {
    static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] ans = twoSum(nums, 9);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.isEmpty()) {
                map.put(nums[i], i);
                continue;
            }

            int needed = target - nums[i];

            if (map.containsKey(needed)) {
                return new int[]{map.get(needed), i};
            }

            map.put(nums[i], i);

        }
        return new int[]{};
    }
}
