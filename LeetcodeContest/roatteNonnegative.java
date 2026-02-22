package LeetcodeContest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class roatteNonnegative {
    public static void main(String[] args) {
        int[] nums = {1, -2, 3, -4};
        int target = 3;
        rotateElements(nums, target);
    }

    private static void rotateElements(int[] nums, int k) {
        List<Integer> positives = new ArrayList<>();

        for (int num : nums) {
            if (num > 0) {
                positives.add(num);
            }
        }

        int m = positives.size();
        if (m == 0) return;

        k = k % m;

        Collections.reverse(positives);
        Collections.reverse(positives.subList(0, k));
        Collections.reverse(positives.subList(k, m));

        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                nums[i] = positives.get(idx++);
            }
        }
    }
}
