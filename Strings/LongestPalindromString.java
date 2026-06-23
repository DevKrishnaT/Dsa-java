package Strings;

public class LongestPalindromString {
    static void main(String[] args) {
        String s = "rccisr";
        String ans = plaindrome(s);
        System.out.println(ans);
    }

    private static String plaindrome(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String sun = s.substring(i, j + 1);

                if (isPalindrome(sun) && sun.length() > ans.length()) {
                    ans = sun;
                }
            }
        }

        return ans;


    }

    private static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
