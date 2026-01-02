package lession_1.topic_group_1.questions.patterns;

public class patter_5 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 0; i < 5; i++) {

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
                    if(count == 1){

                        System.out.print(count);
                        count = 0;
                    }else{
                        System.out.print(count);
                        count = 1;
                    }

                }
            }
            System.out.println();
        }
    }
}
