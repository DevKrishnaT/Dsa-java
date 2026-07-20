package test;

import java.util.Scanner;

public class SumOfDigit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        int num = sc.nextInt();
        int ans = 0;
        while (num > 0) {
            ans += num % 10;
            num /= 10;
        }
        System.out.println("Digit Sum:- " + ans);
    }
}
