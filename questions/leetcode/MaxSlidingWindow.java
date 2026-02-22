package questions.leetcode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MaxSlidingWindow {
    static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] ans = maxSlidingWindow(arr, k);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] maxSlidingWindow(int[] arr, int k) {
        int[] ans = new int[arr.length - k + 1];

        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            if (!queue.isEmpty() && queue.peekFirst() <= i - k) {
                queue.pollFirst();
            }


            while (!queue.isEmpty() && arr[queue.peekLast()] <= arr[i]) {
                queue.pollLast();
            }


            queue.offerLast(i);


            if (i >= k - 1)
                ans[i - k + 1] = arr[queue.peekFirst()];

        }
        return ans;
    }
}
