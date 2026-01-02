package lession_1.topic_group_1.javabasic.array;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++){
            System.out.printf("enter a number for position: " + i);
            arr[i] = sc.nextInt();
        }
        for (int j : arr) {
            System.out.print(j + ",");
        }


    }
}
