package BinarySearch.Revesion;

public class GuessNumber {
    static void main(String[] args) {
        int num = 10;
        int ans = guessNumber(num);
        System.out.println(ans);
    }

    private static int guessNumber(int num) {
        int left = 1000;
        int right = 50;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (guess(mid) == 0) {
                return mid;
            } else if (guess(mid) == -1) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private static int guess(int mid) {
        if (mid > 50) {
            return -1;
        } else if (mid < 50) {
            return 1;
        } else {
            return 0;
        }
    }
}
