package lesson_1.Strings;

public class MaxDepth {
    public static void main(String[] args) {

        String s = "()(())(((())()))";
        int ans = maxDeapth(s);
        System.out.println(ans);
    }

    private static int maxDeapth(String s) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count += 1;
                max = Math.max(max, count);
            } else if (s.charAt(i) == ')') {
                count--;
            }

        }
        return max;
    }
}
