package PrefixSum;

import java.util.HashMap;

public class findMaxLength {
    static void main(String[] args) {
        int[] nums = {0, 1, 1, 1, 1, 1, 0, 0, 0};
        int ans = solve(nums);
    }

    private static int solve(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int prefix = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {


            if (nums[i] == 0) {
                prefix--;
            } else {
                prefix++;
            }

            if (map.containsKey(prefix)) {
                max = Math.max(max, i - map.get(prefix));
            } else {
                map.put(prefix, i);
            }
        }
        return max;
    }
}
