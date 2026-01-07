package lession_1.topic_group_1.questions.basic_q.Strrings;

public class reverseStringOptimize {
    public static void main(String[] args) {
        String S = "ABCDCBA";
        System.out.println(reverse(S));
    }

    public static boolean reverse(String s) {

        int p1 = 0;
        int p2 = s.length() - 1;
        while (p2 > p1) {
            if (s.charAt(p1) != s.charAt(p2)) {
                return false;
            }
            p1++;
            p2--;
        }
        return true;
    }

    ;
}
