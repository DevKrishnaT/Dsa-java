package lesson_1.ArraysQ;

import java.util.HashMap;

public class SubArraysEqlK {
    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;


        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0, count = 0;
       
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            if (prefixSum == k) count++;
            if (!(map.containsKey(prefixSum))) map.put(prefixSum, i);
            if (map.containsKey(prefixSum - k)) count++;
        }
        System.out.println(count);
    }
}
