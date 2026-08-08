package BinarySearch.Revesion.revesion;

import java.util.Arrays;

public class FirstAccAndSec {
    static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] searchRange(int[] nums, int target) {
        int firstAcc = FindFirst(nums, target);
        int lastAcc = FindLast(nums, target);

        return new int[]{firstAcc, lastAcc};
    }

    private static int FindLast(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                ans = mid;
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }

        return ans;
    }

    private static int FindFirst(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                ans = mid;
                right = mid - 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }

        return ans;

    }
}
