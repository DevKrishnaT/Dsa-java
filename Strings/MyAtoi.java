package Strings;

public class MyAtoi {
    public static void main(String[] args) {
        String s = "-91283472332";
        int ans = myAtoi(s);
        System.out.println(ans);

    }

    private static int myAtoi(String s) {
        int i = 0;
        long ans = 0;
        int n = s.length();
        boolean isNegative = false;

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }


        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            isNegative = (s.charAt(i) == '-');
            i++;
        }


        while (i < n) {
            char ch = s.charAt(i);

            if (ch < '0' || ch > '9') {
                break;
            }
            ;
            ans = ans * 10 + (ch - '0');

            if (!isNegative && ans > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (isNegative && -ans < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }
        if (isNegative) ans = -ans;
        return (int) ans;
    }
}
