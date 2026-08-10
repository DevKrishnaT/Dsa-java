package test.userInput;

import test.FuntionFile.Power;

import java.util.Scanner;

public class Input {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:- ");
        int number = sc.nextInt();

        System.out.println();
        System.out.print("Enter power:- ");
        int PowerTimes = sc.nextInt();

        Power p = new Power();

        System.out.println(p.power(number, PowerTimes));

    }
}
