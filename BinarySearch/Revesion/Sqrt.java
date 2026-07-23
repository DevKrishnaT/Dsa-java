package BinarySearch.Revesion;

public class Sqrt {
    static void main(String[] args) {
        int x = 4;
        int ans = mysqrt(x);
        System.out.println(ans);
    }

    private static int mysqrt(int x) {
        if (x < 2) return x;
        int left = 0;
        int right = x / 2;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;
            if (square == x) {
                return mid;
            } else if (square < x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
