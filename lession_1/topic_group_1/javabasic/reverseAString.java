package lession_1.topic_group_1.javabasic;

public class reverseAString {
    public static void main(String[] args) {
        StringBuilder sb  = new StringBuilder("vaani");

        for (int i = 0; i < sb.length()/2; i++) {
            int backI = sb.length() - 1 -i;

            char frontChar = sb.charAt(i);
            char backChar = sb.charAt(backI);

            sb.setCharAt(i, backChar);
            sb.setCharAt(backI , frontChar);


        }
        System.out.println(sb);

    }



}
