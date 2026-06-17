package ArraysQ;

public class palidrome {
    static void main(String[] args) {
        int num = -1;
        boolean ans = palidromeis(num);
        System.out.println(ans);
    }

    private static boolean palidromeis(int num) {
        int temp = num;
        int x = 0;


        while (temp > 0) {
            x *= 10;
            x += temp % 10;
            temp = temp / 10;
        }


        return num == x;
    }
}
