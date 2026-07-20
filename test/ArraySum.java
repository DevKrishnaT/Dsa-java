package test;

import java.util.Scanner;

public class ArraySum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of Array:- ");
        int size = sc.nextInt();
        System.out.println();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.print("enter element of index:- ");
            array[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        

        System.out.println(sum + " ans");
    }
}
