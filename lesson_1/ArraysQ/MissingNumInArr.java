package lesson_1.ArraysQ;

public class MissingNumInArr {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 7, 8};
        int Sum = 0;
        int N = nums.length;
        Sum = N * (N + 1) / 2;

        for (int i = 0; i < nums.length; i++) {
            Sum = Sum - nums[i];

        }
        System.out.println(Sum);

    }
}
