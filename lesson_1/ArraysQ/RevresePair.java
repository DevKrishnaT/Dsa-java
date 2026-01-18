package lesson_1.ArraysQ;

public class RevresePair {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 3, 1};
        int count = 0;
        int left = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int right = nums.length - 1;
            while (right > i) {
                long doubleVal = (long) nums[right] * 2;
                if (doubleVal < nums[i]) {
                    count++;

                }
                right--;
            }
        }
        System.out.println(count);
    }
}
