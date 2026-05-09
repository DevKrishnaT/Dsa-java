package test;

import java.util.Arrays;
import java.util.HashMap;

public class twoSumOptimal {
    static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] output = twosum(nums, target);
        System.out.println(Arrays.toString(output));
    }

    private static int[] twosum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};

            } else {
                map.put(nums[i], i);
            }

        }

        return new int[]{};

    }
}
