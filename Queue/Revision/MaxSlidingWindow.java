package Queue.Revision;

import java.util.LinkedList;
import java.util.Queue;

public class MaxSlidingWindow {
    static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] ans = maxSlidingWindow(nums, k);
    }

    private static int[] maxSlidingWindow(int[] nums, int k) {
        Queue<Integer> queue = new LinkedList<>();
        

        int max = Integer.MIN_VALUE;

        int left = 0;
        int i = 0;
        int[] maxElemnt = new int[(nums.length - k) + 1];
        System.out.println(maxElemnt.length);
        for (int right = 0; right < nums.length; right++) {

            if (right < k) {
                max = Math.max(max, nums[right]);
                continue;
            }


        }
        return maxElemnt;
    }
}
