package lesson_1.sortingsss;

public class selectionSort_2 {
    public static void main(String[] args) {
        int[] nums = {1, 23, 4, 534, 24, 45};
        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }

            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
