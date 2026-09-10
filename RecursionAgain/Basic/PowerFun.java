package RecursionAgain.Basic;

public class PowerFun {
    static void main(String[] args) {
        long ans = Power(3, 3);
        System.out.println(ans);
    }

    private static long Power(int number, int power) {
        if (power == 1) {
            return number;
        }

        return number * Power(number, power - 1);
    }
}
