package RecursionAgain.Basic;

public class CheckisPalindrome {
    static void main(String[] args) {
        String s = "racecar";
        boolean ans = isPalindrome(s, 0, s.length() - 1);
        System.out.println(ans);
    }

    private static boolean isPalindrome(String s, int first, int last) {

        if (first > last) {
            return true;
        }

        if (s.charAt(first) != s.charAt(last)) {
            return false;
        }


        return isPalindrome(s, first + 1, last - 1);

    }
}
