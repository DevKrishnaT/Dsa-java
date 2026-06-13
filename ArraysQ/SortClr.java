package ArraysQ;

import java.util.Arrays;

public class SortClr {
    static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
//        sortColors(nums);
        dutchFlagAlgo(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void dutchFlagAlgo(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;

            } else {
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                mid++;
                high--;
            }
        }
    }

    private static void sortColors(int[] nums) {
        int n = nums.length;

        for (int i = n - 1; i > 0; i--) {

            int j = i;
            while (j < n && nums[j - 1] > nums[j]) {
                int temp = nums[j - 1];
                nums[j - 1] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}
