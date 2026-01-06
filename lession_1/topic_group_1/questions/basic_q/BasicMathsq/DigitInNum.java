package lession_1.topic_group_1.questions.basic_q.BasicMathsq;

public class DigitInNum {
    public static void main(String[] args) {
        int n = 125335;
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }
}
