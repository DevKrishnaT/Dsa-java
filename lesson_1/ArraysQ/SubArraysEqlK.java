package lesson_1.ArraysQ;

import java.util.HashMap;

public class SubArraysEqlK {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 3;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);   // base case

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            prefixSum += num;

            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);

            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        System.out.println(count);
    }
}

