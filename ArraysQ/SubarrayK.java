package ArraysQ;

import java.util.HashMap;

public class SubarrayK {
    static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;
        int ans = count(nums, k);
        System.out.println(ans);
    }

    private static int count(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int count = 0;

        for (int x : nums) {
            sum += x;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
