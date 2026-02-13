package lesson_1.questions;

import java.util.*;

public class GroupAnagrams {
    static void main(String[] args) {
        String[] sta = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> ans = groupAnagrams(sta);
        System.out.println(ans);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            list.add(s);
            char[] stored = s.toCharArray();
            Arrays.sort(stored);
            String key = new String(stored);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }


            map.get(key).add(s);


        }

        for (Map.Entry<String, List<String>> Itr : map.entrySet()) {
            ans.add(Itr.getValue());
        }

        return ans;

    }
}
