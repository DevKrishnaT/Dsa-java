package PrefixSum;

import java.util.HashMap;

public class ContinousLength2 {
    static void main(String[] args) {
        int[] nums = {23, 2, 4, 6, 7};
        int k = 6;
        boolean ans = find(nums, k);
        System.out.println(ans);
    }

    private static boolean find(int[] nums, int k) {
        int prefix = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            prefix += nums[i];
            int rem = ((prefix % k) + k) % k;
            if (map.containsKey(rem)) {
                int index = map.get(prefix % k);
                if (i - index >= 2) {
                    return true;
                }
            } else {
                map.put(prefix % k, i);
            }

        }
        return false;

    }
}
