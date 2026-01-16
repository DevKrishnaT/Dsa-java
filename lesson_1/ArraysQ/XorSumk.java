package lesson_1.ArraysQ;

import java.util.HashMap;

public class XorSumk {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int k = 6;

        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixXor = 0;
        int count = 0;

        
        map.put(0, 1);

        for (int num : arr) {
            prefixXor ^= num;

            int required = prefixXor ^ k;
            if (map.containsKey(required)) {
                count += map.get(required);
            }

            map.put(prefixXor, map.getOrDefault(prefixXor, 0) + 1);
        }

        System.out.println(count);
    }
}
