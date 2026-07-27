package BinarySearch;

import java.util.Scanner;

public class SumOfbBinaryNumber {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("first Binary :- ");
        String a = sc.next();
        System.out.println();
        System.out.print("sec Binary :- ");
        String b = sc.next();

        String ans = addBinary(a, b);
        System.out.println(ans);
    }


    public static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        StringBuilder ans = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            ans.append(sum % 2);
            carry = sum / 2;
        }

        return ans.reverse().toString();

    }

}
