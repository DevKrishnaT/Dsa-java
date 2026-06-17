package ArraysQ;

import java.util.HashMap;

public class SubarraySumk {
    void main(String[] args) {
        int[] arr = {1, 2, 3};
        int k = 3;
        int ans = calcultae(arr, k);
        System.out.println(ans);
    }

    private int calcultae(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int count = 0;

        for (int num : arr) {
            sum += num;

            count += map.getOrDefault(sum - k, 0);

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
