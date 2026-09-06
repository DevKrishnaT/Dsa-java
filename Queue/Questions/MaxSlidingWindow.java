package Queue.Questions;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MaxSlidingWindow {
    static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] ans = maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> queue = new ArrayDeque<>();

        int[] ans = new int[nums.length - k + 1];

        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            while (!queue.isEmpty() && nums[queue.peekLast()] < nums[right]) {
                queue.pollLast();
            }

            queue.offerLast(right);

            while (!queue.isEmpty() && queue.peekFirst() < left) {
                queue.pollFirst();
            }

            if (right >= k - 1) {
                ans[right - k + 1] = nums[queue.peekFirst()];
                left++;
            }

        }
        return ans;
    }
}
