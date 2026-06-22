package Strings;

public class rotate {
    static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeba";
        boolean ans = isRotate(s, goal);
        System.out.println(ans);

    }

    private static boolean isRotate(String s, String goal) {
        if (s.length() != goal.length()) return false;
        return (s + s).contains(goal);

    }
}
