package lesson_1.questions.basic_q.BasicMathsq;

public class armsStrong2 {
    public static void main(String[] args) {
        int n = 153;
        int copy = n;
        int output = 0;
        int power = String.valueOf(n).length();
        while (n > 0) {
            int temp = n % 10;
            n /= 10;
            temp = (int) Math.pow(temp, power);
            output += temp;

        }

        System.out.println(copy == output);
    }
}
