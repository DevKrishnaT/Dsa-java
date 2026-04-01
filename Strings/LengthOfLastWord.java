package Strings;

public class LengthOfLastWord {
    static void main(String[] args) {
        String s = "a";
        int legth = lengthOfLastWord(s);
        int legth2 = lengthOfLastWord2(s);
        System.out.println(legth);
        System.out.println(legth2);
    }

    private static int lengthOfLastWord2(String s) {

        int curr = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (curr != 0) {
                    return curr;
                }
                continue;
            }
            curr++;
        }


        return curr;
    }

    private static int lengthOfLastWord(String s) {
        int legthOfLast = 0;
        int currLegth = 0;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                if (currLegth != 0) {
                    legthOfLast = currLegth;
                }
                currLegth = 0;
            } else {
                currLegth++;
            }
        }
        if (currLegth != 0) {
            legthOfLast = currLegth;
        }

        return legthOfLast;
    }
}
