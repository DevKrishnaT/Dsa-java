package lesson_1.questions.basic_q.arraylist;

public class fibonachi {
    public static void main(String[] args) {
        int n = 0;
        fibonachi(n);
    }

    public static int fibonachi(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {

            int c = a + b;
            a = b;
            b = c;


        }
        return a;
    }
}
