package SlidingWindow;

import java.util.HashSet;

public class ContainsNearbyDuplicate {
    static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2, 3};
        int k = 2;
        boolean ans = containsNearbyDuplicate(nums, k);
        System.out.println(ans);
    }

    private static boolean containsNearbyDuplicate(int[] nums, int k) {
        int left = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int right = 0; right < nums.length; right++) {

            if (right - left > k) {
                set.remove(nums[left]);
                left++;
            }

            if (set.contains(nums[right])) {
                return true;
            }

            set.add(nums[right]);
        }
        return false;
    }
}
