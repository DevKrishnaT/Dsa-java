package lesson_1.BinarySearch;

public class SearchInrotatedArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1};
        int target = 3;
        int idx = search(arr, target);
        System.out.println(idx);
    }

    private static int search(int[] nums, int target) {
        int idx = -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {

                return mid;
            }

            if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return idx;
    }
}
