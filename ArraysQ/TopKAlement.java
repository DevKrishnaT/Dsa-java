package ArraysQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKAlement {
    static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] ans = topKFrequent(arr, k);
        

        System.out.println(Arrays.toString(ans));
    }

    private static int[] topKFrequent(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[k];
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        pq.addAll(map.keySet());
        int i = 0;
        while (k-- > 0) {
            ans[i++] = pq.poll();
        }

        return ans;
    }
}
