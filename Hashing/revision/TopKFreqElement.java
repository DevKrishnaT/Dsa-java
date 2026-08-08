package Hashing.revision;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFreqElement {
    static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] ans = freq(nums, k);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] freq(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet());
        int[] ans = new int[k];
        int i = 0;
        while (k-- > 0) {
            ans[i++] = pq.poll();
        }

        return ans;
    }
}
