package test;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Integer> q = new LinkedList<>();
        try {
            int x = sc.nextInt();
            System.out.println("yoooo vro hows going");
        } catch (InputMismatchException e) {
            System.out.println("Enter number");
        }
        System.out.println("lesh go");

    }
}
