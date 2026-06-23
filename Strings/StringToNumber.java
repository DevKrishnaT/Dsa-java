package Strings;

public class StringToNumber {
    static void main(String[] args) {
        String num = "  -0120345320cdg345";
        int ans = myAtoi(num);
        System.out.println(ans);
    }

    private static int myAtoi(String s) {
        long num = 0;
        boolean isNegative = false;
        int i = 0;
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            isNegative = s.charAt(i) == '-';
            i++;
        }

        while (i < s.length()) {
            char ch = s.charAt(i);

            if (ch < '0' || ch > '9') {
                break;
            }

            num = num * 10 + (ch - '0');

            if (!isNegative && num > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (isNegative && num > 2147483648L) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        if (isNegative) num = -num;
        return (int) num;
    }
}
