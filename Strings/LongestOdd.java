package Strings;

public class LongestOdd {
    public static void main(String[] args) {
        String s = "4957585689";
        String ans = largestOddNumber(s);
        System.out.println(ans);
    }

    public static String largestOddNumber(String s) {

        for (int i = s.length() - 1; i >= 0; i--) {
            if ((s.charAt(i) - '0') % 2 == 1) {
                return s.substring(0, i + 1);
            }
        }
        return "";
    }
}
