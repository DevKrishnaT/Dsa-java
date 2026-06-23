package Strings;

public class ExpandArroundCorner {
    void main(String[] args) {
        String s = "rccisr";
        String ans = largetpalindrome(s);
    }

    int start = 0;
    int end = 0;

    private String largetpalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            expand(s, i, i);
            expand(s, i, i + 1);
        }

        return s.substring(start, end + 1);
    }

    private void expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        int len = right - left - 1;

        if (len > end - start + 1) {

            start = left + 1;
            end = right - 1;
        }
    }
}
