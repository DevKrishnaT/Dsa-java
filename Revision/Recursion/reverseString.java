package Revision.Recursion;

import java.util.Objects;

public class reverseString {
    static void main(String[] args) {
        char[] s = {'k', 'r', 'i', 's', 'h', 'n', 'a'};
        ReverseString(s);
        System.out.println(s);
    }


    private static void ReverseString(char[] s) {
        int n = s.length;
        int i = 0;
        int j = n - 1;

        recursive(s, i, j);
    }

    private static void recursive(char[] s, int i, int j) {
        if (i >= j) {
            return;
        }

        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;

        recursive(s, i + 1, j - 1);
    }


}
