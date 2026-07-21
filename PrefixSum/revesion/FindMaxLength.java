package PrefixSum.revesion;

import java.util.HashMap;

public class FindMaxLength {
    static void main(String[] args) {
        int[] nums = {0, 1, 1, 1, 1, 1, 0, 0, 0};
        int ans = findMaxLength(nums);
        System.out.println(ans);
    }

    private static int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefix = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                prefix++;
            } else {
                prefix--;
            }

            if (map.containsKey(prefix)) {
                ans = Math.max(ans, i - map.get(prefix));
            } else {
                map.put(prefix, i);
            }


        }
        return ans;
    }
}
