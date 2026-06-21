package ArraysQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum4 {
    static void main(String[] args) {
        int[] nums = {-1, 0, -2, 2, 4};
        int target = 4;
        List<List<Integer>> ans = calculate(nums, target);
        System.out.println(ans);
    }

    private static List<List<Integer>> calculate(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int j = 0; j < n - 3; j++) {
            if (j > 0 && nums[j] == nums[j - 1]) continue;
            for (int i = j + 1; i < n - 2; i++) {
                if (i > j + 1 && nums[i] == nums[i - 1]) continue;
                int left = i + 1;
                int right = n - 1;
                while (left < right) {
                    long currSum = 0;
                    currSum += nums[j];
                    currSum += nums[i];
                    currSum += nums[left];
                    currSum += nums[right];

                    if (currSum == target) {
                        List<Integer> curr = new ArrayList<>();
                        curr.add(nums[j]);
                        curr.add(nums[i]);
                        curr.add(nums[left]);
                        curr.add(nums[right]);
                        ans.add(curr);
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left - 1]) left++;
                        while (left < right && nums[right] == nums[right + 1]) right--;
                    } else if (currSum < target) {
                        left++;
                    } else {
                        right--;
                    }

                }
            }
        }
        return ans;
    }
}
