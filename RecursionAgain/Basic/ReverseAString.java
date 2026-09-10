package RecursionAgain.Basic;

public class ReverseAString {
    static void main(String[] args) {
        String s = "Krishna";
        String ans = Reverse(s);
        System.out.println(ans);
    }

    private static String Reverse(String s) {

        if (s.length() <= 1) {
            return s;
        }

        return Reverse(s.substring(1)) + s.charAt(0);
    }


}
