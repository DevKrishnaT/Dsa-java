package test;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class IsNStraightHand {
    static void main(String[] args) {
        int[] nums = {1, 9};
        int k = 3;
        boolean ans = isNStraightHand(nums, k);
        System.out.println(ans);
    }

    private static boolean isNStraightHand(int[] nums, int n) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i : nums) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(freq.keySet());

        while (!minHeap.isEmpty()) {
            int start = minHeap.peek();
      

            for (int i = 0; i < n; i++) {
                int curr = start + i;

                if (!freq.containsKey(curr)) return false;

                freq.put(curr, freq.get(curr) - 1);

                if (freq.get(curr) == 0) {
                    if (curr != minHeap.peek()) return false;
                    minHeap.poll();
                    freq.remove(curr);
                }
            }
        }

        return true;

    }


}
