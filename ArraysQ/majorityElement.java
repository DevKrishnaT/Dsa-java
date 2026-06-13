package ArraysQ;

import java.util.HashMap;

public class majorityElement {
    static void main(String[] args) {
        int[] nums = {6, 5, 5};
        int ans = major(nums);
        System.out.println(ans);
    }

    private static int major(int[] nums) {
        int major = nums.length / 2;


        HashMap<Integer, Integer> map = new HashMap<>();


        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);


            if (map.get(x) > major) {
                return x;
            }
        }

        return -1;


    }
}
