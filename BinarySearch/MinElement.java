package BinarySearch;

public class MinElement {
    public static void main(String[] args) {
        int[] arr = {11, 13, 15, 17};
        int min = findMin(arr);
        System.out.println(min);

    }

    private static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int MinElement = Integer.MAX_VALUE;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            MinElement = Math.min(MinElement, nums[mid]);
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return MinElement;
    }

}
