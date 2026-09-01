package QuickRevision;

import java.util.Scanner;

public class DiceGame {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = 16;
        while (times > 0) {
            System.out.print("Enter number :- ");
            int number = sc.nextInt();
            try {

                if (number < 0 || number > 6) {
                    throw new IllegalArgumentException("Number must be between 0 and 6");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            if (number == 1 || number == 4) {
                System.out.println("you won the game");
                return;
            } else {
                System.out.println("try again");
            }
            times--;
        }
        System.out.println("You lost the game");


    }
}
