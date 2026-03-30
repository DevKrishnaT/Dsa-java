package collection_framework.maps;

import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKfreq {
    static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 2, 3};
        int k = 2;
        int[] ans = topKFrequent(nums, k);
    }

    private static int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (a, b) -> map.get(a) - map.get(b)
        );

        for (int key : map.keySet()) {
            pq.add(key);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int i = 0;
        while (!pq.isEmpty()) {
            ans[i++] = pq.poll();
        }

        return ans;

    }
}
