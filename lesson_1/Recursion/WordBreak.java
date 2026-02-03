package lesson_1.Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WordBreak {


    static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("leet");
        list.add("code");
        String s = "leetcod";

        System.out.println(Track(s, list));
    }

    Map<String, Boolean> memo = new HashMap<>();

    private static boolean Track(String s, ArrayList<String> list) {

      
        if (s.length() == 0) return true;

        for (String small : list) {
            if (s.startsWith(small)) {
                String temp = s.substring(small.length());
                if (Track(temp, list)) {
                    return true;
                }
            }
        }


        return false;
    }


}
