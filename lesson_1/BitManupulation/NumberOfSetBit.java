package lesson_1.BitManupulation;

public class NumberOfSetBit {
    static void main(String[] args) {
        int n = 15;
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count += 1;
        }

        System.out.println(count);
    }
}
