package Strings;

public class LongestPalindromeStringRecursion {
    void main(String[] args) {
        String s = "rccisr";
        String ans = plaindrome(s);
        System.out.println(ans);
    }

    Boolean[][] dp;

    private String plaindrome(String s) {

        int n = s.length();
        dp = new Boolean[n][n];
        int start = 0;
        int len = 1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {


                if (solve(s, i, j)) {
                    if (j - i + 1 > len) {
                        len = j - i + 1;
                        start = i;
                    }
                }
            }
        }

        return s.substring(start, start + len);


    }

    private boolean solve(String sun, int i, int j) {
        if (i >= j) {
            return true;
        }

        if (dp[i][j] != null) {
            return dp[i][j];
        }

        if (sun.charAt(i) != sun.charAt(j)) {
            return dp[i][j] = false;
        }

        return dp[i][j] = solve(sun, i + 1, j - 1);
    }


}
