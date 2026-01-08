package lesson_1.questions.basic_q;

import java.util.Scanner;

public class basic_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println("now arry");

        int[] arr = {};

        for (int i = 0; i <= n; i++) {
            System.out.print("enter the number of " + i);
            int num = input.nextInt();
            arr[i] = num;
        }
    }


}
