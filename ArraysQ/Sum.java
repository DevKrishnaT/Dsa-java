package ArraysQ;

import java.util.Arrays;
import java.util.HashMap;

public class Sum {
    static void main(String[] args) {
        int[] nums = {2, 7, 11, 13};
        int target = 9;
        int[] ans = two(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] two(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];
            if (map.containsKey(needed)) {
                return new int[]{map.get(needed), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
