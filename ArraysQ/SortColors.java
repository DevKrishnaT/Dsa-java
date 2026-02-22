package ArraysQ;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortcolors(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    private static void sortcolors(int[] nums, int left, int right) {
        if (left < right) {
            int pivit = partition(nums, left, right);

            sortcolors(nums, left, pivit - 1);
            sortcolors(nums, pivit + 1, right);
        }

    }

    private static int partition(int[] nums, int left, int right) {
        int pivit = nums[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (nums[j] < pivit) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[i + 1];
        nums[i + 1] = pivit;
        nums[right] = temp;
        return i + 1;
    }

}
