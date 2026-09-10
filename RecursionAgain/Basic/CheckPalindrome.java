package RecursionAgain.Basic;

public class CheckPalindrome {
    static void main(String[] args) {
        String s = "krishnaanhsir";
        boolean ans = isPalindrome(s);
        System.out.println(ans);
    }

    private static boolean isPalindrome(String s) {

        String rev = Reverse(s);

        return rev.equals(s);
    }

    private static String Reverse(String s) {
        if (s.length() <= 1) {
            return s;
        }

        return Reverse(s.substring(1)) + s.charAt(0);
    }
}
