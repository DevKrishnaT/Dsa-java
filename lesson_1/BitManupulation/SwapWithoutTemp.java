package lesson_1.BitManupulation;

public class SwapWithoutTemp {
    static void main(String[] args) {
        int x = 56;
        int y = 2;
        swap(x, y);

    }

    private static void swap(int x, int y) {
        System.out.println(x + " " + y);
        
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println(x + " " + y);
    }
}
