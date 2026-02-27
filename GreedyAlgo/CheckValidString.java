package GreedyAlgo;

import java.util.Stack;

public class CheckValidString {
    static void main(String[] args) {
        String s = "(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())";
        boolean ans = checkValidString(s);
        System.out.println(ans);
    }

    private static boolean checkValidString(String s) {
        int low = 0;
        int high = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                low++;
                high++;
            } else if (c == ')') {
                if (low > 0) low--;
                high--;
            } else {
                if (low > 0) low--;
                high++;
            }


            if (high < 0) return false;
        }

        return low == 0;
    }
}
