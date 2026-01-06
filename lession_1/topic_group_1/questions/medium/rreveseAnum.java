package lession_1.topic_group_1.questions.medium;

public class rreveseAnum {
    public static int reverse(int x) {
        int revers = 0;
        while (x != 0) {
            int digit = x % 10;
            x = x / 10;

            if (revers > Integer.MAX_VALUE / 10 ||
                    (revers == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            if (revers < Integer.MIN_VALUE / 10 ||
                    (revers == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            revers = revers * 10 + digit;
        }
        return revers;
    }

    ;

    public static void main(String[] args) {
        int n = -321;
        
        System.out.println(reverse(n));
    }
}
