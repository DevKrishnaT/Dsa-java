package Revision.Recursion;

import java.util.Arrays;

public class SupperDigit {
    static void main(String[] args) {
        String num = "9875";
        int k = 4;
        int ans = superDigit(num, k);

    }

    private static int superDigit(String num, int k) {
        long Afterk = 0;

        for (char c : num.toCharArray()) {
            Afterk += c - '0';
        }
        Afterk *= k;
        if (Afterk < 10) {
            return (int) Afterk;
        }
        return (int) recursive(Afterk);
    }

    private static long recursive(long num) {
        if (num < 10) {
            return num;
        }

        long sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return recursive(sum);
    }


}
