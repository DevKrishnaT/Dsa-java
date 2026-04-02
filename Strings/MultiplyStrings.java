package Strings;

public class MultiplyStrings {
    static void main(String[] args) {
        String s1 = "123";
        String s2 = "0";


        String ans = mulStrings(s1, s2);


    }

    private static String mulStrings(String s1, String s2) {
        if (s1.equals("0") || s2.equals("0")) {
            return "0";
        }

        int n = s1.length();
        int m = s2.length();

        int[] result = new int[n + m];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                int digit1 = s1.charAt(i) - '0';
                int digit2 = s2.charAt(j) - '0';

                int mul = digit1 * digit2;
                int sum = mul + result[i + j + 1];

                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.isEmpty() && num == 0)) {
                sb.append(num);
            }
        }

        return sb.toString();
    }
}
