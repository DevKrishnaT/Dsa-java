package BitManupulation;

public class Trcick {
    static void main(String[] args) {
        int x = 5;

//        if (x == 10) {
//            x = 5;
//        } else if (x == 5) {
//            x = 10;
//
//        }

        x = 10 ^ 5 ^ x;


        System.out.println(x);
    }
}
