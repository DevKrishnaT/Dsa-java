package Revision.Recursion;

public class PalidromeNum {
    static void main(String[] args) {
        int num = 12421;
        boolean ans = isPalindrome(num);
        System.out.println(ans);
    }

    private static boolean isPalindrome(int num) {
        if (num < 0) return false;

        int div = 1;

        while (num / div >= 10) {
            div *= 10;
        }

        return helper(num, div);
    }

    private static boolean helper(int x, int div) {
        if (div <= 1) {
            return true;
        }

        int left = x / div;
        int right = x % 10;

        if (left != right) return false;

        x = (x % div) / 10;

        return helper(x, div / 100);
    }
}
