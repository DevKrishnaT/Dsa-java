package lesson_1.ArraysQ;

public class MaximumSumOfArray {
    public static void main(String[] args) {
        int[] arr = {-2, -3, -7, -2, -10, -4};
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > max) {
                max = sum;
            }

            if (sum < 0) {
                sum = 0;
            }

        }
        System.out.println(max);
    }


}
