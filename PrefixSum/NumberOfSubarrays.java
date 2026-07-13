package PrefixSum;

import java.util.HashMap;

public class NumberOfSubarrays {
    static void main(String[] args) {
        int[] nums = {2, 2, 2, 1, 2, 2, 1, 2, 2, 2};
        int k = 2;
        int ans = numberOfSubarrays(nums, k);
        System.out.println(ans);
    }

    private static int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefix = 0;

        int count = 0;
        map.put(0, 1);

        for (int num : nums) {


            if (num % 2 != 0) {
                prefix++;
            }

            if (map.containsKey(prefix - k)) {
                count += map.get(prefix - k);
            }

            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }

        return count;
    }
}
