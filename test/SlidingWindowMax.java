package test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMax {
    static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] ans = slidingMax(nums, k);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] slidingMax(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];
        Deque<Integer> queue = new ArrayDeque<>();
        int left = 0;
        for (int i = 0; i < nums.length; i++) {

            while (!queue.isEmpty() && nums[queue.getLast()] < nums[i]) {
                queue.pollLast();
            }

            queue.offerLast(i);
            while (!queue.isEmpty() && queue.peekFirst() < left) {
                queue.pollFirst();
            }


            if (i >= k - 1) {
                ans[i - k + 1] = nums[queue.peekFirst()];
                left++;
            }


        }
        return ans;
    }
}
