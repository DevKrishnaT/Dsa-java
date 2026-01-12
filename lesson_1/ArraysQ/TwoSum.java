package lesson_1.ArraysQ;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] r = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int Find = target - nums[i];
            if (map.containsKey(Find)) {
                r[0] = map.get(Find);
                r[1] = i;

                return r;
            } else {
                map.put(nums[i], i);
            }


        }
        return r;
    }

}
