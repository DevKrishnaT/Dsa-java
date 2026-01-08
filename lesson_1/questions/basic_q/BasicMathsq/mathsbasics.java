package lesson_1.questions.basic_q.BasicMathsq;

public class mathsbasics {
    public static int reverse(int x) {

        int revers = 0;
        boolean signal = false;
        if (x < 0) {
            x = Math.abs(x);
            signal = true;
        }

        while (x > 0) {
            revers *= 10;
            revers += x % 10;

            x = x / 10;


        }
        if (signal == true) {
            return -Math.abs(revers);
        }
        return revers;
    }

    ;

    public static void main(String[] args) {
        int n = 1534236469;
        System.out.println(reverse(n));

    }
}
