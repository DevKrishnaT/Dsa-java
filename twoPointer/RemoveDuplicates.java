package twoPointer;

import java.util.Arrays;

public class RemoveDuplicates {
    static void main(String[] args) {
        int[] nums = {0, 0, 1, 1};
        int ans = remove(nums);
        System.out.println(ans);
    }

    private static int remove(int[] nums) {
        int first = 0;
        for (int sec = 1; sec < nums.length; sec++) {
            if (nums[first] == nums[sec]) {
                continue;
            }
            first++;
            nums[first] = nums[sec];

        }
        System.out.println(Arrays.toString(nums));
        return first + 1;
    }
}
