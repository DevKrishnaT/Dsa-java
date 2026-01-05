package lession_1.topic_group_1.javabasic;

public class lamda {
    public static void main(String[] args) {
        MathOperation SumOpration = (a, b) -> a + b;
        MathOperation SubtractOpration = (a, b) -> a - b;

        int res = SumOpration.oprattion(1, 7);
        System.out.println(res);

    }
}

interface MathOperation {
    int oprattion(int a, int b);
}