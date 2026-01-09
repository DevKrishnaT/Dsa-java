package lesson_1.ArraysQ;

public class sortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1, 9, 3, 4, 5, 6, 7, 8};
        System.out.println(SoretedOrNot(arr));

    }

    static boolean SoretedOrNot(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {

            if (!(nums[i] < nums[i + 1])) {
                return false;
            }


        }
        return true;
    }
}
