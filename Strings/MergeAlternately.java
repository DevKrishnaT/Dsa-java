package Strings;

public class MergeAlternately {
    static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "pq";
        String ans = mergeAlternately(s1, s2);
        System.out.println(ans);
    }

    private static String mergeAlternately(String s1, String s2) {

        boolean firstTake = true;
        int index = 0;


        StringBuilder sb = new StringBuilder();
        while (index < s1.length() && index < s2.length()) {
            if (firstTake) {
                sb.append(s1.charAt(index));
                firstTake = false;
            } else {
                sb.append(s2.charAt(index));
                firstTake = true;
                index++;
            }
        }

        while (index < s1.length()) {
            sb.append(s1.charAt(index++));
        }

        while (index < s2.length()) {
            sb.append(s2.charAt(index++));
        }

        return sb.toString();
    }
}
