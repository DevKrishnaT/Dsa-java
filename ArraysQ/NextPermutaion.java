package ArraysQ;

public class NextPermutaion {
    public static void main(String[] args) {
        int[] nums = {7, 6, 5, 4, 3, 2, 1};
        int p = pivit(nums);
        if (p == -1) {
            reverseArr(nums, 0, nums.length - 1);
        }

        int max = findNextGreater(nums, p);

        int temp = nums[max];
        nums[max] = nums[p];
        nums[p] = temp;

        reverseArr(nums, p + 1, nums.length - 1);

    }

    private static void reverseArr(int[] nums, int left, int right) {

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }

    }


    private static int pivit(int[] nums) {
        int pivit = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                pivit = i - 1;
                break;
            }
        }

        return pivit;
    }

    private static int findNextGreater(int[] nums, int p) {
        for (int i = nums.length - 1; i > p; i--) {
            if (nums[i] > nums[p]) {
                return i;
            }
        }
        return -1;
    }

}





