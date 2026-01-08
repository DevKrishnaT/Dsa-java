package lesson_1.questions.basic_q.Strrings;

public class reveseString {
    public static void main(String[] args) {
        String S = "ABCDCBA";
        System.out.println(reverse(S));


    }

    public static boolean reverse(String s) {
        StringBuilder mainString = new StringBuilder(s);
        mainString.reverse();

        return mainString.toString().equals(s);

    }
}
