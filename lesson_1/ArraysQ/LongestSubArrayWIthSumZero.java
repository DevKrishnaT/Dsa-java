package lesson_1.ArraysQ;

import java.util.HashMap;

public class LongestSubArrayWIthSumZero {
    public static void main(String[] args) {
        int[] arr = {2, 10, 4};
        int k = 0;
        HashMap<Integer, Integer> Map = new HashMap<>();
        int prefix = 0;
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            prefix += arr[i];
            if (prefix == k) maxLength = Math.max(maxLength, i + 1);
            if (!(Map.containsKey(prefix))) Map.put(prefix, i);
            if (Map.containsKey(prefix)) maxLength = Math.max(maxLength, i - Map.get(prefix));

        }
        System.out.println(maxLength);
    }
}
