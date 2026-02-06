package lesson_1.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SparshArry {
    static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("ab");
        stringList.add("ab");
        stringList.add("abc");
        ArrayList<String> queries = new ArrayList<>();
        queries.add("ab");
        queries.add("abc");
        queries.add("bc");
        List<Integer> ans = matchingStrings(stringList, queries);
        System.out.println(ans);

    }

    private static List<Integer> matchingStrings(ArrayList<String> stringList, ArrayList<String> queries) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : stringList) {
            System.out.println(s);
            map.merge(s, 1, Integer::sum);
        }

        for (String s : queries) {
            list.add(map.getOrDefault(s, 0));

        }
        return list;

    }
}
