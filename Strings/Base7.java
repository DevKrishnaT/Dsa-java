package Strings;

public class Base7 {
    static void main(String[] args) {
        int s = 100;
        String ans = find(s);
    }

    private static String find(int num) {
        if (num == 0) {
            return "0";
        }
        boolean negative = num < 0;
        num = Math.abs(num);
        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            sb.append(num % 7);
            num /= 7;

        }
        if (negative) {
            sb.append("-");
        }

        return sb.reverse().toString();
    }
}
