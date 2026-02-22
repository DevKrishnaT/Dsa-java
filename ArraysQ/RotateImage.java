package ArraysQ;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = nums.length;
        for (int[] i : nums) {
            System.out.println(Arrays.toString(i));
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = nums[i][j];
                System.out.println(temp);
                nums[i][j] = nums[j][i];
                System.out.println(nums[j][i]);
                nums[j][i] = temp;

            }

        }

        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = nums.length - 1;
            while (left < right) {
                int temp = nums[i][left];
                nums[i][left] = nums[i][right];
                nums[i][right] = temp;
                left++;
                right--;
            }

        }
        for (int[] i : nums) {
            System.out.println(Arrays.toString(i));
        }
    }
}
