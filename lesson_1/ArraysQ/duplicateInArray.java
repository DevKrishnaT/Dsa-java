package lesson_1.ArraysQ;

public class duplicateInArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println(removeDup(nums));
    }

    private static int removeDup(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }

        }
        return i + 1;
    }
}
