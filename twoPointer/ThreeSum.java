package twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> ans = threeSum(nums);
        System.out.println(ans);
    }

    private static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = 0;
                sum += nums[i];
                sum += nums[left];
                sum += nums[right];

                if (sum == 0) {
                    ArrayList<Integer> curr = new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right]));
                    ans.add(curr);
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (sum < 0) {
                    left++;
                } else {

                    right--;
                }
            }
        }
        return ans;
    }
}
