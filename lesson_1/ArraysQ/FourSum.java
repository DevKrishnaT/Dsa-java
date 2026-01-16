package lesson_1.ArraysQ;

import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        int[] arr = {1, 0, -1, 0, -2, 2};
        int target = 0;
        System.out.println(fourSum(arr, target));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();

        int n = nums.length;

        Arrays.sort(nums);
        for (int j = 0; j < n - 3; j++) {
            if (j > 0 && nums[j] == nums[j - 1]) continue;
            for (int i = j + 1; i < n - 2; i++) {
                if (i > j + 1 && nums[i] == nums[i - 1]) continue;

                int left = i + 1;
                int right = n - 1;
                while (left < right) {
                    long sum = (long) nums[j] + nums[i] + nums[left] + nums[right];

                    if (sum == target) {
                        list.add(Arrays.asList(nums[j], nums[i], nums[left], nums[right]));
                        left++;
                        right--;

                        while (left < right && nums[left] == nums[left - 1]) left++;
                        while (left < right && nums[right] == nums[right + 1]) right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }

            }
        }
        return list;
    }
}
