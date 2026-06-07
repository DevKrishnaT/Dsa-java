package Strings;

public class isPalindrome {
    static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean ans = isvalidPalindrome(s);
        System.out.println(ans);
    }

    private static boolean isvalidPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
                continue;
            }

            if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
                continue;
            }

            if (Character.toLowerCase(s.charAt(start++)) != Character.toLowerCase(s.charAt(end--))) {
                return false;
            }
        }

        return true;
    }
}
