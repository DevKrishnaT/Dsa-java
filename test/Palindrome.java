package test;

import java.util.Scanner;

public class Palindrome {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:- ");
        int n = sc.nextInt();
        int orignal = n;
        int reverse = 0;
        while (n > 0) {
            reverse += n % 10;

            n /= 10;
            reverse *= 10;
        }
        reverse /= 10;

        if (reverse == orignal) {

            System.out.println("yes");
        } else {
            System.out.println(reverse);
            System.out.println(orignal);
            System.out.println("No");
        }
    }
}
