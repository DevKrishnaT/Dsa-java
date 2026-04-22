package Strings;

public class RotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeabfh";
        boolean ans = rotateString(s, goal);
        System.out.println(ans);
    }

    private static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        return (s + s).contains(goal);
    }
}
