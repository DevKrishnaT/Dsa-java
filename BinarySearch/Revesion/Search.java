package BinarySearch.Revesion;

public class Search {
    static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int ans = search(nums, target);
        System.out.println(ans);
    }

    private static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }

        return -1;
    }
}
