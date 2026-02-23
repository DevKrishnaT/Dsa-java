package test;

import java.util.*;

public class TopKFrequent {
    static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 1, 2, 3, 1, 3, 2};
        int k = 2;
        int[] ans = topKFrequent(nums, k);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] topKFrequent(int[] nums, int k) {
        if (nums.length < k) return new int[]{};
        int[] ans = new int[k];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);

        }
        PriorityQueue<Integer> pq =
                new PriorityQueue<>(
                        (a, b) -> Integer.compare(map.get(b), map.get(a))
                );

        pq.addAll(map.keySet());
        int i = 0;
        while (k-- > 0) {
            ans[i++] = pq.poll();

        }

        return ans;


    }
}
