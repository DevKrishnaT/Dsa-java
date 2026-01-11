package lesson_1.ArraysQ;

import java.util.Arrays;
import java.util.HashMap;

public class longestSubArrayNegative {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, -10};
        int k = 15;
        HashMap<Integer, Integer> Map = new HashMap<>();
        int prefix = 0;
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            prefix += arr[i];
            if (prefix == k) maxLength = Math.max(maxLength, i + 1);
            if (!(Map.containsKey(prefix))) Map.put(prefix, i);
            if (Map.containsKey(prefix - k)) maxLength = Math.max(maxLength, i - Map.get(prefix - k));

        }
        System.out.println(maxLength);


    }
}
