package Revision;

import java.util.Scanner;

public class SumOfDigites {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first digit: ");
        int n = sc.nextInt();

        int ans = 0;
        while (n > 0) {
            ans += n % 10;
           
            n = n / 10;
        }
        System.out.println(ans);
    }
}
