package RandomeQtest;

import java.util.HashMap;

public class SubArraySumEqK {
    static void main(String[] args) {
        int[] arr = {1, 1, 1};
        int k = 2;
        int ans = subarraySum(arr, k);
        System.out.println(ans);
    }

    private static int subarraySum(int[] arr, int k) {
        int prefix = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int ans = 0;
        for (int num : arr) {
            prefix += num;
            if (map.containsKey(prefix - k)) {
                ans += map.get(prefix - k);
            }


            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }

        return ans;
    }
}
