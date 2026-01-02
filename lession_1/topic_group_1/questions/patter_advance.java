package lession_1.topic_group_1.questions;

public class patter_advance {
    public static void main(String[] args) {
        int n = 4;
        // for uper half plus half

        for(int i = 0; i< n; i++){
            //start print loop
            for (int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            for (int j = 0; j < n - i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n -i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            System.out.println();



        }
        for (int i = n-1 ; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
