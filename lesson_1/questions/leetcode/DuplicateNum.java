package lesson_1.questions.leetcode;

import java.util.HashMap;

public class DuplicateNum {
    static void main(String[] args) {
        int[] nums = {1, 1};
        int ans = findDuplicate(nums);
        System.out.println(ans);
    }

    private static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        slow = nums[0];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

    private static int findDuplicateFast(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (!map.containsKey(i)) {
                map.put(i, 0);
            } else {
                return i;
            }
        }
        return -1;
    }
}
