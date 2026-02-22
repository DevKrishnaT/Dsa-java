package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleElement3 {
    static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 3, 5};
        int[] ans = singleNumber(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] singleNumber(int[] nums) {
        int[] arr = new int[nums.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.merge(num, 1, Integer::sum);

        }
        System.out.println(map);
        int k = 0;
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() == 1) {
                arr[k++] = m.getKey();
            }
        }

        return Arrays.copyOfRange(arr, 0, k);
    }
}
