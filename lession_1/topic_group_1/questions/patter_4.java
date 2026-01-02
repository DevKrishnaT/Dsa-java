package lession_1.topic_group_1.questions;

public class patter_4 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            int count = 1;
            for (int j = 0; j < 5; j++) {
                if(i == 0 && j == 1){
                    break;
                } else if (i == 1 && j==2) {
                    break;
                } else if (i == 2 && j == 3) {
                    break;
                }else if (i == 3 && j == 4) {
                    break;
                }
                else {
                    System.out.print(count);
                    count++;
                }
            }
            System.out.println();
        }
    }

    public static class patter_3 {
        public static void main(String[] args) {

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if(i == 0 && j == 1){
                        break;
                    } else if (i == 1 && j==2) {
                        break;
                    } else if (i == 2 && j == 3) {
                        break;
                    }
                    else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
    }
}
