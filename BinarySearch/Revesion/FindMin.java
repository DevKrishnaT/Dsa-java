package BinarySearch.Revesion;

public class FindMin {
    static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        int ans = findMin(nums);
        System.out.println(ans);
    }

    private static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return nums[left];
    }
}
