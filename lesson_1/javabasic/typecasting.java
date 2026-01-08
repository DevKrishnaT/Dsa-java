package lesson_1.javabasic;

import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float number = input.nextFloat();

        int conversion = (int) (number);
        System.out.println(conversion);
    }
}
