package Heap.Questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class ArrayRankTransform {
    static void main(String[] args) {
        int[] arr = {40, 10, 10, 30};
        int[] ans = arrayRankTransform(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] arrayRankTransform(int[] nums) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i : nums) {
            heap.add(i);
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 1;

        while (!heap.isEmpty()) {
            int val = heap.poll();

            if (!map.containsKey(val)) {
                map.put(val, i);
                i++;
            }
        }


        for (int j = 0; j < nums.length; j++) {
            nums[j] = map.get(nums[j]);
        }
        return nums;
    }
}
