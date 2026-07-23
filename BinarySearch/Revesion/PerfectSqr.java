package BinarySearch.Revesion;

public class PerfectSqr {
    static void main(String[] args) {
        int nums = 16;
        boolean ans = isPerfectSquare(nums);
    }

    private static boolean isPerfectSquare(int nums) {
        int left = 1;
        int right = nums / 2;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            long square = (long) mid * mid;

            if (square == nums) {
                return true;
            }

            if (square < nums) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}
