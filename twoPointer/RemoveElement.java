package twoPointer;

import java.util.Arrays;

public class RemoveElement {
    static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int ans = removeElement(nums, val);
        System.out.println(ans);
    }

    private static int removeElement(int[] nums, int val) {
        int first = 0;
        for (int sec = 0; sec < nums.length; sec++) {
            if (val == nums[sec]) {
                continue;

            }
            nums[first] = nums[sec];
            first++;
        }
        System.out.println(Arrays.toString(nums));
        return first;
    }
}
