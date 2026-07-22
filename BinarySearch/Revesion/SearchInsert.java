package BinarySearch.Revesion;

public class SearchInsert {
    static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int ans = searchInsert(nums, target);
        System.out.println(ans);
    }

    private static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }
}
