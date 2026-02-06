package lesson_1.BitManupulation;

public class IntegerTobit {
    static void main(String[] args) {
        int n = Integer.MAX_VALUE;
        String ans = Covert(n);
        System.out.println(ans);

    }

    private static String Covert(int n) {
        StringBuilder res = new StringBuilder();

        while (n != 1) {
            if (n % 2 == 1) res.append("1");
            else res.append("0");
            n = n / 2;

        }
        res.append("1");
        res.reverse();

        return res.toString();
    }

}
