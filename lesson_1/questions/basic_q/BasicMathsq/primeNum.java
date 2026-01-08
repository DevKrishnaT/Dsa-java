package lesson_1.questions.basic_q.BasicMathsq;

public class primeNum {
    public static boolean isPrime(int n) {
        if (n == 1 || n == 0) return false;
        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) {
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(isPrime(n));


    }
}
