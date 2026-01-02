package lession_1.topic_group_1.javabasic;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class switchLearn {

    public static void main(String[] args) {
        System.out.print("enter any number from 0 - 3: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        switch(number){
            case 1: System.out.println("hello");
            break;
            case 2: System.out.println("namaste");
            break;
            case 3:
                System.out.println("ni hao");
                break;
            default: System.out.println("invalid");
        }

    }
}
