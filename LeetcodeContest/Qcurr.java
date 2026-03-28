package LeetcodeContest;

import java.util.HashMap;

public class Qcurr {
    static void main(String[] args) {
        int[] nums = {1, 0, 0, 2, 0, 1};

        HashMap<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                map.put(1, i);
            } else if (nums[i] == 2) {
                map.put(2, i);
            }

            if (map.containsKey(2) && map.containsKey(1)) {
                int ans = Math.abs(map.get(1) - map.get(2));

                min = Math.min(ans, min);
            }

        }
        if (min == Integer.MAX_VALUE) {
            min = -1;
        }
        ;
    }
}
