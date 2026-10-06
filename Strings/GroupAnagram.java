package Strings;

import java.util.*;

public class GroupAnagram {
    static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> ans = groupAngram(strs);
        System.out.println(ans);
    }

    private static List<List<String>> groupAngram(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
       
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String curr = new String(arr);

            if (map.containsKey(curr)) {
                map.get(curr).add(s);
            } else {
                map.put(curr, new ArrayList<>());
                map.get(curr).add(s);
            }
        }

        List<List<String>> list = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            list.add(entry.getValue());
        }
        return list;
    }
}
